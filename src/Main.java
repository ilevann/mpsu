import DoubleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(0);

        list.appendNode(new Node<Integer>(1));
        list.appendNode(new Node<Integer>(2));
        list.appendNode(new Node<Integer>(3));

        int temp = list.get(2).getData();
        System.out.println(temp);
    }
}
