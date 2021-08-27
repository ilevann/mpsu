import DoubleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(0);

        list.append(new Node<Integer>(1));
        list.append(new Node<Integer>(2));
        list.append(new Node<Integer>(3));

        list.printAll();

        Node<Integer> one = new Node<Integer>(null, 228, null);
        Node<Integer> two = new Node<Integer>(one, 1337, null);
        one.setNext(two);
        Node<Integer> three = new Node<Integer>(two, 420, null);
        two.setNext(three);
        Node<Integer> four = new Node<Integer>(three, 69, null);
        three.setNext(four);

        list.insertBefore(list.findFirst(2), four);

        list.printAll();


    }
}
