import DynamicArray.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        array.set(4, 5);
        array.set(6, 5);
        array.set(5, 777);

        array.printAll();
        array.remove(5);
        array.printAll();
    }
}
