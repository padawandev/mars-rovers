package business;

public class InvalidPositionException extends Exception {

	/**
	 * Default serial
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidPositionException(String message) {
		super(message);
	}
	
	public InvalidPositionException() {
		this("");
	}
}
