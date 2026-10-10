public class OverDrawnException extends Exception {
    public OverDrawnException(String message) {
        super(message);
    }

    public OverDrawnException() {
    }

    public OverDrawnException(Throwable cause) {
        super(cause);
    }
}
