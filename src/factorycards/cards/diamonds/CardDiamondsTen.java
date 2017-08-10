package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsTen implements Card {

	public static final CardDiamondsTen CARD_DIAMONDS_TEN = new CardDiamondsTen();

	private Color color = Color.DIAMONDS;
	private Value value = Value.TEN;
	private String cardName = "Diamonds_Ten";

	private CardDiamondsTen() {

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
