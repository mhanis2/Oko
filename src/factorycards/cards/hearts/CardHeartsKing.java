package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsKing implements Card {

	public static final CardHeartsKing CARD_HEARTS_KING = new CardHeartsKing();

	private Color color = Color.CLUBS;
	private Value value = Value.KING;
	private String cardName = "Hearts_King";

	private CardHeartsKing() {

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
