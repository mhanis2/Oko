package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsEight implements Card {

	public static final CardHeartsEight CARD_HEARTS_EIGHT = new CardHeartsEight();

	private Color color = Color.CLUBS;
	private Value value = Value.EIGHT;
	private String cardName = "Hearts_Eight";

	private CardHeartsEight() {

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
