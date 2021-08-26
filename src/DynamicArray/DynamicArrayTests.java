package DynamicArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DynamicArrayTests {
    // INIT TESTS
    @Test
    public void init_sizeDefault() {
        DynamicArray<Integer> array = new DynamicArray<Integer>();

        int expected = array.defaultSize;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_SizeCustom() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        int expected = 10;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_InvalidSize_ThrowsException() {
        assertThrows(InvalidArraySizeException.class, () -> new DynamicArray<Integer>(-1));
        assertThrows(InvalidArraySizeException.class, () -> new DynamicArray<Integer>(0));
    }

    // GETSIZE TESTS

    @Test
    public void getSize() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(5);

        int expected = 5;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    // GET TESTS

    @Test
    public void get() {
        DynamicArray<String> array = new DynamicArray<String>(5);

        array.set(0, "ama here");

        String expected = "ama here";
        String actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void get_InvalidIndex_ThrowsException() {
        DynamicArray<String> array = new DynamicArray<String>(5);

        assertThrows(InvalidIndexException.class, () -> array.get(-1));
        assertThrows(InvalidIndexException.class, () -> array.get(5));
    }

    // FINDFIRST TESTS

    @Test
    public void findFirst_int() {
        DynamicArray<Integer> array = new DynamicArray<Integer> (10);

        for (int i=0; i < array.getSize(); i++) {
            array.set(i, i);
        }

        array.set(3, 777);

        int expected = 3;
        int actual = array.findFirst(777);
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_int_multiple() {
        DynamicArray<Integer> array = new DynamicArray<Integer> (10);

        for (int i=0; i < array.getSize(); i++) {
            array.set(i, i);
        }

        array.set(3, 777);
        array.set(4, 777);

        int expected = 3;
        int actual = array.findFirst(777);
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_InvalidValue_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        for (int i=0; i < array.getSize(); i++) {
            array.set(i, i);
        }

        assertThrows(InvalidIndexException.class, () -> array.findFirst(777));
    }

    // FINDLAST TESTS

    @Test
    public void findLast_int() {
        DynamicArray<Integer> array = new DynamicArray<Integer> (10);

        for (int i=0; i < array.getSize(); i++) {
            array.set(i, i);
        }

        array.set(3, 777);

        int expected = 3;
        int actual = array.findLast(777);
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_int_multiple() {
        DynamicArray<Integer> array = new DynamicArray<Integer> (10);

        for (int i=0; i < array.getSize(); i++) {
            array.set(i, i);
        }

        array.set(3, 777);
        array.set(4, 777);

        int expected = 3;
        int actual = array.findLast(777);
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_InvalidValue_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        for (int i=0; i < array.getSize(); i++) {
            array.set(i, i);
        }

        assertThrows(InvalidIndexException.class, () -> array.findLast(777));
    }

    // SET TESTS

    @Test
    public void set_int() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        array.set(0, 777);

        int expected = 777;
        int actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_InvalidIndex_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        assertThrows(InvalidIndexException.class, () -> array.set(-1, 777));
        assertThrows(InvalidIndexException.class, () -> array.set(10, 777));
    }

    // RESIZE TESTS

    @Test
    public void resize_smaller() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        array.resize(9);

        int expected = 9;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void resize_bigger() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        array.resize(11);

        int expected = 11;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void resize_valueValidation() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        for (int i=0; i < array.getSize(); i++) {
            array.set(i, i);
        }

        array.resize(11);
        array.set(10, 10);

        for (int i=0; i < array.getSize(); i++) {
            assertEquals(i, array.get(i));
        }
    }

    // APPEND TESTS

    // INSERT TESTS

    // REMOVE TESTS

}
