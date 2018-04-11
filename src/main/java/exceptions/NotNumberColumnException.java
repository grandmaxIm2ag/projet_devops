package main.java.exceptions;

/**
 * Exception Handling for Column without Numbers in it.
 * @author Ducruy Yann,Marco Florian,Grand Maxence
 */
public class NotNumberColumnException extends Exception{

    /**
     * Exception for column without numbers
     * @param message String of error message
     */
    public NotNumberColumnException(String message) {
		super(message);
	}

    /**
     *
     * @param message String of error message
     * @param throwable Error to throw
     */
    public NotNumberColumnException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
