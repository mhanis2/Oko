package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesAce implements Card {

	public static final CardSpadesAce CARD_SPADES_ACE = new CardSpadesAce();

	private Color color = Color.SPADES;
	private Value value = Value.ACE;
	private String cardName = "Spades_Ace";

	private CardSpadesAce() {

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
