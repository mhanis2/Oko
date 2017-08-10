package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsJack implements Card {

	public static final CardDiamondsJack CARD_DIAMONDS_JACK = new CardDiamondsJack();

	private Color color = Color.DIAMONDS;
	private Value value = Value.JACK;
	private String cardName = "Diamonds_Jack";

	private CardDiamondsJack() {

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
