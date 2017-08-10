package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsJack implements Card {

	public static final CardHeartsJack CARD_HEARTS_JACK = new CardHeartsJack();

	private Color color = Color.CLUBS;
	private Value value = Value.JACK;
	private String cardName = "Hearts_Jack";

	private CardHeartsJack() {

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
