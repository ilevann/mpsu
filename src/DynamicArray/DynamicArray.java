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
}
