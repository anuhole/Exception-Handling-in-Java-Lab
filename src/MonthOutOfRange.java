public class MonthOutOfRange extends RuntimeException {
    public MonthOutOfRange(String message) {
        super(message);
    }

    public MonthOutOfRange() {
    }

    public MonthOutOfRange(Throwable cause) {
        super(cause);
    }
}
