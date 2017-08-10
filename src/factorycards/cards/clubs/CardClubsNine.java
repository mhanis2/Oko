package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsNine implements Card {

	public static final CardClubsNine CARD_CLUBS_NINE = new CardClubsNine();

	private Color color = Color.CLUBS;
	private Value value = Value.NINE;
	private String cardName = "Clubs_Nine";

	private CardClubsNine() {

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
