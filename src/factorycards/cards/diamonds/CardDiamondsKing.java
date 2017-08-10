package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsKing implements Card {

	public static final CardDiamondsKing CARD_DIAMONDS_KING = new CardDiamondsKing();

	private Color color = Color.DIAMONDS;
	private Value value = Value.KING;
	private String cardName = "Diamonds_King";

	private CardDiamondsKing() {

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
