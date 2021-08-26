package DoubleLinkedList;

public class DoubleLinkedList<T> {
    public Node<T> start;
    public Node<T> end;

    public DoubleLinkedList() {
        start = new Node<T>();
        end = new Node<T>();

        start.setNext(end);
        start.getNext().setPrev(start);
    }

    public DoubleLinkedList(T value) {
        start = new Node<T>();
        end = new Node<T>();

        start.setData(value);

        start.setNext(end);
        start.getNext().setPrev(start);
    }

    // GET INFO

    public int getSize() {
        Node<T> iterator = start;
        int size = 1;

        if (start == null) {
            return 0;
        }

        while (iterator.getNext() != null) {
            size++;
            iterator = iterator.getNext();
        }

        return size;
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

    public void appendNode(Node<T> node) {

        // links the last node to the new node

        node.setPrev(end);
        end.setNext(node);

    }

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
