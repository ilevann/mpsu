import DynamicArray.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> list = new DynamicArray<Integer>(10);

        list.set(5, 5);
        list.insert(5, 777);
        list.printAll();
    }
}
