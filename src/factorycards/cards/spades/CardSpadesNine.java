package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesNine implements Card {

	public static final CardSpadesNine CARD_SPADES_NINE = new CardSpadesNine();

	private Color color = Color.SPADES;
	private Value value = Value.NINE;
	private String cardName = "Spades_Nine";

	private CardSpadesNine() {

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
