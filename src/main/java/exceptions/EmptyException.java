package main.java.exceptions;

/**
 * Empty Exception Definition Exception throwing for empty dataframe
 *
 * @author Ducruy Yann,Marco Florian,Grand Maxence
 */
public class EmptyException extends Exception {

    /**
     * Empty Exception
     *
     * @param message String of error message
     */
    public EmptyException(String message) {
        super(message);
    }

    /**
     * Empty Exception
     *
     * @param message String of error message
     * @param throwable throwable exception
     */
    public EmptyException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
