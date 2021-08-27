package DoubleLinkedList;

public class DoubleLinkedList<T> {
    public Node<T> start;
    public Node<T> end;

    public DoubleLinkedList() {
        start = new Node<T>();
        start.setPrev(start);
        end = start;
    }

    public DoubleLinkedList(T value) {
        start = new Node<T>();
        start.setData(value);

        end = start;
    }

    // GET INFO

    public int getSize() {

        // returns number of nodes

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

        int listSize = getSize();
        if (index < 0 || index >= listSize) {
            throw new InvalidIndexException(index, listSize);
        }

        Node<T> iterator = start;

        for (int i = 0; i < index; i++) {
            iterator = iterator.getNext();
        }

        return iterator;
    }

    public Node<T> getStart() {

        // returns first node

        return start;
    }

    public Node<T> getEnd() {

        // returns last node

        return end;
    }

    public Node<T> findFirst(T value) {

        // returns the first occurrence of node with a specific value

        Node<T> iterator = start;
        while (iterator != null) {

            if (iterator.getData() != null && iterator.getData().equals(value)) {
                return iterator;
            }

            iterator = iterator.getNext();
        }

        throw new ValueNotFoundException();
    }

    public int findFirstIndex(T value) {

        // returns index of the first occurrence of node with a specific value

        Node<T> iterator = start;
        int index = 0;

        while (iterator != null) {

            if (iterator.getData() != null && iterator.getData().equals(value)) {
                return index;
            }

            index++;
            iterator = iterator.getNext();
        }

        throw new ValueNotFoundException();
    }

    public Boolean isEmpty() {
        Node<T> iterator = start;

        while (iterator != null) {

            if (iterator.getData() != null) {
                return false;
            }

            iterator = iterator.getNext();
        }

        return true;
    }

    public Boolean isFull() {
        Node<T> iterator = start;

        while (iterator != null) {

            if (iterator.getData() == null) {
                return false;
            }

            iterator = iterator.getNext();
        }

        return true;
    }

    public boolean contains(T value) {
        Node<T> iterator = start;

        while (iterator != null) {

            if (iterator.getData() != null && iterator.getData().equals(value)) {
                return true;
            }

            iterator = iterator.getNext();
        }

        return false;
    }

    // EDIT LIST

    public void append(Node<T> newNode) {

        // links new node to the last one

        // connecting new node to the last one
        end.setNext(newNode);
        newNode.setPrev(end);

        // checking if newNode has its own connections
        Node<T> iterator = newNode;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }

        // declaring the last newNode connection the end
        end = iterator;
    }

    public void pop(Node<T> node) {

        // removes given node

        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }

    public void popIndex(int index) {

        // removes the node at the given index from the list

        Node<T> node = get(index);
        pop(node);
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

    public void printAll() {
        Node<T> iterator = start;

        System.out.print("(");
        while (iterator.getNext() != null) {
            System.out.print(iterator.getData() + ", ");
            iterator = iterator.getNext();
        }

        System.out.println(iterator.getData() + ")");
    }
}
