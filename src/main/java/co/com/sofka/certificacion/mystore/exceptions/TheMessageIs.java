package co.com.sofka.certificacion.mystore.exceptions;

@SuppressWarnings("serial")
public class TheMessageIs extends AssertionError{

	public static final String MESSAGE_ERROR = "The message to welcome for the user is not the expected";
	
	public TheMessageIs(String message, Throwable cause) {
		super(message, cause);
	}
}
