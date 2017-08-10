package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsQueen implements Card {

	public static final CardClubsQueen CARD_CLUBS_QUEEN = new CardClubsQueen();

	private Color color = Color.CLUBS;
	private Value value = Value.QUEEN;
	private String cardName = "Clubs_Queen";

	private CardClubsQueen() {

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
