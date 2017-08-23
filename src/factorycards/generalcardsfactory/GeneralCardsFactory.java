package factorycards.generalcardsfactory;

import factorycards.CardsFactory;
import model.card.Card;
import model.card.Color;
import model.card.Value;

public class GeneralCardsFactory implements CardsFactory {


	/**
	 * Create a card for a game according to values of Color and Value.
	 */
	@Override
	public Card createCard(Color color, Value label) {
		Card newCard = new Card(color, label);
		return newCard;
	}

}
