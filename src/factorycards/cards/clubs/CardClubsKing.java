package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsKing implements Card {

	public static final CardClubsKing CARD_CLUBS_KING = new CardClubsKing();

	private Color color = Color.CLUBS;
	private Value value = Value.KING;
	private String cardName = "Clubs_King";

	private CardClubsKing() {

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
