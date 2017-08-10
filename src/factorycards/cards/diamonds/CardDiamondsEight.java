package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsEight implements Card {

	public static final CardDiamondsEight CARD_DIAMONDS_EIGHT = new CardDiamondsEight();

	private Color color = Color.DIAMONDS;
	private Value value = Value.EIGHT;
	private String cardName = "Diamonds_Eight";

	private CardDiamondsEight() {

	}

	@Override
	public Color getColor() {

		return this.color;
	}

	@Override
	public Value getValue() {

		return this.value;
	}

	@Override
	public String getNameOfCard() {

		return this.cardName;
	}

}
