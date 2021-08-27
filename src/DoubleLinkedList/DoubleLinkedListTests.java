package DoubleLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DoubleLinkedListTests {

    // INIT TESTS

    @Test
    public void init() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        int expected = 1;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_CustomValue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(5);

        int expected = 1;
        int actual = list.getSize();
        assertEquals(expected, actual);

        expected = 5;
        actual = list.get(0).getData();
        assertEquals(expected, actual);
    }

    // GETSIZE TESTS

    @Test
    public void getSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.appendValue(1);
        list.appendValue(1);
        list.appendValue(1);

        int expected = 4;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getSize_empty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        int expected = 1;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    // GET TESTS

    @Test
    public void get() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(0);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        int expected = 2;
        int actual = list.get(2).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void get_InvalidIndex_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        assertThrows(InvalidIndexException.class, () -> list.get(-1));
        assertThrows(InvalidIndexException.class, () -> list.get(5));
    }

    // GETSTART TESTS

    @Test
    public void getStart() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(228);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        int expected = 228;
        int actual = list.getStart().getData();
        assertEquals(expected, actual);
    }

    // GETEND TESTS

    @Test
    public void getEnd() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(228);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        int expected = 3;
        int actual = list.getEnd().getData();
        assertEquals(expected, actual);
    }

    // FINDFIRST TESTS

    // FINDFIRSTINDEX TESTS

    // ISEMPTY TESTS

    // ISFULL TESTS

    // CONTAINS TESTS

    // APPEND TESTS

    // APPENDVALUE TESTS

    // POP TESTS

    // POPINDEX TESTS

    // INSERTAFTER TESTS

    // INSERTBEFORE TESTS

}
