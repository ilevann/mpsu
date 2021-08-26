package DynamicArray;

public class InvalidIndexException extends RuntimeException {

    public InvalidIndexException(int index) {
        super("Index " + index + " doesn't exists");
    }
}
