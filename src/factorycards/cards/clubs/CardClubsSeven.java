package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsSeven implements Card {

	public static final CardClubsSeven CARD_CLUBS_SEVEN = new CardClubsSeven();

	private Color color = Color.CLUBS;
	private Value value = Value.SEVEN;
	private String cardName = "Clubs_Seven";

	private CardClubsSeven() {

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
