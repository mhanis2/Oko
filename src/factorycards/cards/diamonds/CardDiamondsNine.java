package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsNine implements Card {

	public static final CardDiamondsNine CARD_DIAMONDS_NINE = new CardDiamondsNine();

	private Color color = Color.DIAMONDS;
	private Value value = Value.NINE;
	private String cardName = "Diamonds_Nine";

	private CardDiamondsNine() {

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
