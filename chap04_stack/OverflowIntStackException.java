package chap04_stack;

public class OverflowIntStackException extends Exception {
    public OverflowIntStackException() {
    }

    public OverflowIntStackException(String message) {
        super(message);
    }
}
