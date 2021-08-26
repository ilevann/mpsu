package DoubleLinkedList;

public class DoubleLinkedList<T> {
    public Node<T> start;
    public Node<T> end;

    int DEFAULT_SIZE = 0;

    // GET INFO

    public int getSize() {
        return 0;
    }

    public Node<T> get(int index) {

        // returns node by its index

        return start;
    }

    public Node<T> getStart(int index) {

        // returns first node

        return start;
    }

    public Node<T> getEnd(int index) {

        // returns last node

        return end;
    }

    public Node<T> findFirst(T value) {

        // returns node by its value

        return start;
    }

    public Boolean isEmpty() {
        return true;
    }

    public boolean contains(T data) {
        return true;
    }

    // EDIT LIST

    public void popNode(Node<T> node) {

        // disconnects node from other nodes

    }


    public void insertAfter(int index) {

        // connects list.get(index) node to new node
        // and then connects new node to list.get(index + 1)

    }

    public void insertBefore(int index) {

        // connects list.get(index - 1) node to new node
        // and then connects new node to list.get(index)

    }

    // DEV METHODS

    private void traverse() {

        // traverses throughout list

    }
}
