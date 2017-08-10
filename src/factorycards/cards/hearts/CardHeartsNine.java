package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsNine implements Card {

	public static final CardHeartsNine CARD_HEARTS_NINE = new CardHeartsNine();

	private Color color = Color.CLUBS;
	private Value value = Value.NINE;
	private String cardName = "Hearts_Nine";

	private CardHeartsNine() {

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
