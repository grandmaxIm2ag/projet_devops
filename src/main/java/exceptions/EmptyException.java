package exceptions;

public class EmptyException extends Exception{
	public EmptyException(String message) {
		super(message);
	}

	public EmptyException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
