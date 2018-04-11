package main.java.exceptions;

public class NotNumberColumnException extends Exception{
	public NotNumberColumnException(String message) {
		super(message);
	}

	public NotNumberColumnException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
