package DoubleLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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



    // GETSTART TESTS

    // GETEND TESTS

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
