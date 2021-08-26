import DoubleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.append(new Node<Integer>(1));
        list.append(new Node<Integer>(2));
        list.append(new Node<Integer>(3));
        list.append(new Node<Integer>(3));
        list.append(new Node<Integer>(3));

        int temp = list.findFirstIndex(3);
        System.out.println(temp);
    }
}
