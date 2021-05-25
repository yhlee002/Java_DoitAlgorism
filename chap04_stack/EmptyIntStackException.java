package chap04_stack;

public class EmptyIntStackException extends Exception {
    public EmptyIntStackException() {
    }

    public EmptyIntStackException(String message) {
        super(message);
    }
}
