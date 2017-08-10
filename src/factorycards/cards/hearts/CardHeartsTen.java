package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsTen implements Card {

	public static final CardHeartsTen CARD_HEARTS_TEN = new CardHeartsTen();

	private Color color = Color.CLUBS;
	private Value value = Value.TEN;
	private String cardName = "Hearts_Ten";

	private CardHeartsTen() {

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
