package factorycards;

import model.card.Card;
import model.card.Color;
import model.card.Value;

public interface CardsFactory {

	/**
	 * Create card according to color and value.
	 * 
	 * @param color
	 * @param label
	 * @return Card with set color and value
	 */
	public Card createCard(Color color, Value label);

}
