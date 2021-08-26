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

        // returns list element by index

        if (index < 0 || index > list.length) {
            throw new InvalidIndexException(index, getSize());
        }

        return list[index];
    }

    public int findFirst(T value) {
        for (int i=0; i < getSize(); i++) {
            if (get(i).equals(value)) {
                return i;
            }
        }

        throw new ValueNotFoundException();
    }

    public int findLast(T value) {
        int last_index = -1;

        for (int i=0; i < getSize(); i++) {
            if (get(i).equals(value)) {
                last_index = i;
            }
        }

        if (last_index >= 0) {
            return last_index;
        }

        throw new ValueNotFoundException();
    }

    // EDIT ARRAY

    public void set(int index, T value) {
        if (index < 0 || index > getSize()) {
            throw new InvalidIndexException(index, getSize());
        }

        list[index] = value;
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
