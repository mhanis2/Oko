package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesEight implements Card {

	public static final CardSpadesEight CARD_SPADES_EIGHT = new CardSpadesEight();

	private Color color = Color.SPADES;
	private Value value = Value.EIGHT;
	private String cardName = "Spades_Eight";

	private CardSpadesEight() {

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
