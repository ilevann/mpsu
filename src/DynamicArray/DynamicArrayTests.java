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

    // GET TESTS

    // FINDFIRST TESTS

    // FINDLAST TESTS

    // SET TESTS

    // RESIZE TESTS

    // APPEND TESTS

    // INSERT TESTS

    // REMOVE TESTS

}
