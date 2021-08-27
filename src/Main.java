import DoubleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(0);

        list.append(new Node<Integer>(1));
        list.append(new Node<Integer>(2));
        list.append(new Node<Integer>(3));

        list.printAll();

        list.pop(list.get(2));

        list.printAll();
    }
}
