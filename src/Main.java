import DoubleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.appendNode(new Node<Integer>(1));
        list.appendNode(new Node<Integer>(1));
        list.appendNode(new Node<Integer>(1));

        System.out.println(list.getSize());
    }
}
