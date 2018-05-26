package ee.jakarta.mvc;

public class TodoException extends RuntimeException {
    private ExceptionType type;

    public TodoException(ExceptionType exceptionType) {
        super(exceptionType.toString());
        this.type = exceptionType;
    }

    public ExceptionType getType() {
        return type;
    }

    public enum ExceptionType{
        TODO_TITLE_EMPTY(100);
        private int code;

        ExceptionType(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }
}
