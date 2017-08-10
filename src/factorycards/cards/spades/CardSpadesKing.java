package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesKing implements Card {

	public static final CardSpadesKing CARD_SPADES_KING = new CardSpadesKing();

	private Color color = Color.SPADES;
	private Value value = Value.KING;
	private String cardName = "Spades_King";

	private CardSpadesKing() {

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
