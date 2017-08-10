package factorycards.cards;

import model.card.Color;
import model.card.Value;

public interface Card {

	/**
	 * Get color of card.
	 * @return
	 */
	public Color getColor();

	/**
	 * Get value of card.
	 * @return
	 */
	public Value getValue();

	/**
	 * Get name of Card.
	 * @return
	 */
	public String getNameOfCard();

}
