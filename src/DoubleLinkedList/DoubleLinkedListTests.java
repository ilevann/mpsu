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

    @Test
    public void findFirst() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 228;
        int actual = beginning.findFirst(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<Integer>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 228;
        actual = middle.findFirst(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 228;
        actual = last.findFirst(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 228;
        int actual = beginning.findFirst(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findFirst(228));
    }

    // FINDFIRSTINDEX TESTS

    @Test
    public void findFirstIndex() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 0;
        int actual = beginning.findFirstIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<Integer>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 2;
        actual = middle.findFirstIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 4;
        actual = last.findFirstIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findFirstIndex_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 0;
        int actual = beginning.findFirstIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findFirstIndex_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findFirstIndex(228));
    }

    // FINDLAST TESTS

    @Test
    public void findLast() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 228;
        int actual = beginning.findLast(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<Integer>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 228;
        actual = middle.findLast(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 228;
        actual = last.findLast(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 228;
        int actual = beginning.findLast(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findLast(228));
    }

    // FINDLASTINDEX TESTS

    @Test
    public void findLastIndex() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 0;
        int actual = beginning.findLastIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<Integer>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 2;
        actual = middle.findLastIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 4;
        actual = last.findLastIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findLastIndex_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<Integer>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 3;
        int actual = beginning.findLastIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findLastIndex_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findLastIndex(228));
    }

    // ISEMPTY TESTS

    @Test
    public void isEnpty_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        boolean expected = true;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void isEnpty_NotEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.appendValue(1);
        list.appendValue(1);
        list.appendValue(1);

        boolean expected = false;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void isEnpty_FullList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = false;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    // ISFULL TESTS

    @Test
    public void isFull_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        boolean expected = false;
        boolean actual = list.isFull();
        assertEquals(expected, actual);
    }

    @Test
    public void isFull_NotEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.appendValue(1);
        list.appendValue(1);
        list.appendValue(1);

        boolean expected = false;
        boolean actual = list.isFull();
        assertEquals(expected, actual);
    }

    @Test
    public void isFull_FullList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = true;
        boolean actual = list.isFull();
        assertEquals(expected, actual);
    }

    // CONTAINS TESTS

    @Test
    public void contains_ValueExists() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = true;
        boolean actual = list.contains(4);
        assertEquals(expected, actual);
    }

    @Test
    public void contains_ValueNotExists() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = false;
        boolean actual = list.contains(228);
        assertEquals(expected, actual);
    }

    // APPEND TESTS

    // APPENDVALUE TESTS

    // POP TESTS

    // POPINDEX TESTS

    // INSERTAFTER TESTS

    // INSERTBEFORE TESTS

}
