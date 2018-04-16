package exceptions;

/**
 * Exception Handling for Column without Numbers in it.
 *
 * @author Ducruy Yann,Marco Florian,Grand Maxence
 */
public class NotNumberColumnException extends Exception {

    /**
     * Exception for column without numbers
     *
     * @param message String of error message
     */
    public NotNumberColumnException(String message) {
        super(message);
    }

}
