package excepciones;

public class MyException  extends RuntimeException{
    private final ErrorCode code;

    public MyException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }

    public MyException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;
    }

    public MyException(Throwable cause, ErrorCode code) {
        super(cause);
        this.code = code;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
