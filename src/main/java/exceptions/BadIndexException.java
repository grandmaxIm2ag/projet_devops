package exceptions;

/**
 * Exception for negative or Out of bound index
 *
 * @author Ducruy Yann,Marco Florian,Grand Maxence
 */
public class BadIndexException extends Exception{

	/**
     * Bad Index
     *
     * @param message String of error message
     */
	public BadIndexException(String message) {
		super(message);
	}
}
