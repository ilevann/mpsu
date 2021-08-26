package DoubleLinkedList;

public class InvalidListSizeException extends RuntimeException {

    public InvalidListSizeException() {
        super("Invalid size. It should be greater than 0.");
    }
}
