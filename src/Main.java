import DoubleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(0);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(7);

        Node<Integer> three = new Node<Integer>(null, 3, null);
        Node<Integer> four = new Node<Integer>(three, 4, null);
        three.setNext(four);
        Node<Integer> five = new Node<Integer>(four, 5, null);
        four.setNext(five);
        Node<Integer> six = new Node<Integer>(four, 6, null);
        five.setNext(six);

        list.insertAfter(list.findFirst(2), four);

        list.printAll();


    }
}
