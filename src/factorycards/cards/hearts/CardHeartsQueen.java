package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsQueen implements Card {

	public static final CardHeartsQueen CARD_HEARTS_QUEEN = new CardHeartsQueen();

	private Color color = Color.CLUBS;
	private Value value = Value.QUEEN;
	private String cardName = "Hearts_Queen";

	private CardHeartsQueen() {

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

		return cardName;
	}

}
