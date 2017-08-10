package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsSeven implements Card {

	public static final CardHeartsSeven CARD_HEARTS_SEVEN = new CardHeartsSeven();

	private Color color = Color.CLUBS;
	private Value value = Value.SEVEN;
	private String cardName = "Hearts_Seven";

	private CardHeartsSeven() {

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
