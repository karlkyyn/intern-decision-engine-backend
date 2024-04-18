package ee.taltech.inbankbackend.exceptions;

/**
 * Thrown when customer is too young.
 */
public class InvalidCustomerAgeException extends Throwable {
    private final String message;
    private final Throwable cause;

    public InvalidCustomerAgeException(String message) {
        this(message, null);
    }

    public InvalidCustomerAgeException(String message, Throwable cause) {
        this.message = message;
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
