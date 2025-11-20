package ir.farzadafi.exception;

public class JdbcQueryException extends RuntimeException {
    public JdbcQueryException(String message) {
        super(message);
    }
}
