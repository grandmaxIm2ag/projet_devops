package exceptions;
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
}
