package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsEight implements Card {

	public static final CardClubsEight CARD_CLUBS_EIGHT = new CardClubsEight();

	private Color color = Color.CLUBS;
	private Value value = Value.EIGHT;
	private String cardName = "Clubs_Eight";

	private CardClubsEight() {

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
