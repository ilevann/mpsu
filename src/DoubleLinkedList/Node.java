package DoubleLinkedList;

public class Node<T> {
    private Node<T> prev;
    private Node<T> next;
    private T data;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }

    public Node(Node<T> prev, Node<T> next, T data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }

    // GET INFO

    public T getData() {
        return data;
    }

    public Node<T> getPrev() {

        // returns previous node

        return prev;
    }

    public Node<T> getNext() {

        // returns next node

        return next;
    }

    // EDIT NODE

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
