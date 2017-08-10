package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesQueen implements Card {

	public static final CardSpadesQueen CARD_SPADES_QUEEN = new CardSpadesQueen();

	private Color color = Color.SPADES;
	private Value value = Value.QUEEN;
	private String cardName = "Spades_Queen";

	private CardSpadesQueen() {

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
