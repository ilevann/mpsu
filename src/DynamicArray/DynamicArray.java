package DynamicArray;

public class DynamicArray<T> {

    public T[] list;
    public int defaultSize = 0;

    public DynamicArray() {
        list = (T[]) new Object[defaultSize];
    }

    public DynamicArray(int size) {
        if (size < 1) {
            throw new InvalidArraySizeException();
        }

        list = (T[]) new Object[size];
    }

    // GET INFO

    public int getSize() {

        // returns number of elements in the list

        return list.length;
    }

    public T get(int index) {

        // returns the element by index

        return null;
    }

    public int findFirst(T value) {
        return 0;
    }

    public int findLast(T value) {
        return 0;
    }

    // EDIT ARRAY

    public void set(int index, T value) {
        return;
    }

    public void resize(int newSize) {
        return;
    }

    public void append(T value) {
        return;
    }

    public void insert(int index, T value) {
        return;
    }

    public void remove(int index) {
        return;
    }

    // DEV METHODS
    protected void printAll() {
        return;
    }
}
