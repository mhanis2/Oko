package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsTen implements Card {

	public static final CardClubsTen CARD_CLUBS_TEN = new CardClubsTen();

	private Color color = Color.CLUBS;
	private Value value = Value.TEN;
	private String cardName = "Clubs_Ten";

	private CardClubsTen() {

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
