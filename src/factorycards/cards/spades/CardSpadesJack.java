package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesJack implements Card {

	public static final CardSpadesJack CARD_SPADES_JACK = new CardSpadesJack();

	private Color color = Color.SPADES;
	private Value value = Value.JACK;
	private String cardName = "Spades_Jack";

	private CardSpadesJack() {

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
