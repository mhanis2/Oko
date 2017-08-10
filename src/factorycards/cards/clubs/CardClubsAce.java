package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsAce implements Card {

	public static final CardClubsAce CARD_CLUBS_ACE = new CardClubsAce();

	private Color color = Color.CLUBS;
	private Value value = Value.ACE;
	private String cardName = "Clubs_Ace";

	private CardClubsAce() {

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
