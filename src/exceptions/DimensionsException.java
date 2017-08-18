package exceptions;

public class DimensionsException extends Exception {

	private static final long serialVersionUID = 5902692949184066066L;
	
	/**
	 * Dimensions of card are invalid.
	 * @param message
	 */
	public DimensionsException(String message) {
		super(message);
		System.err.println(message);
	}

}
