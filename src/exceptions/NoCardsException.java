package exceptions;

public class NoCardsException extends Exception{

	private static final long serialVersionUID = 1343035740627593703L;

	/**
	 * Players have no cards.
	 * @param str
	 */
	public NoCardsException(String message) {
		super(message);
		System.err.println(message);
	}
}
