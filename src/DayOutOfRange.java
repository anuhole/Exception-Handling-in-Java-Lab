public class DayOutOfRange extends RuntimeException {
    public DayOutOfRange(String message) {
        super(message);
    }

    public DayOutOfRange() {
    }

    public DayOutOfRange(Throwable cause) {
        super(cause);
    }
}
