package factorycards.cards.clubs;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardClubsJack implements Card {

	public static final CardClubsJack CARD_CLUBS_JACK = new CardClubsJack();

	private Color color = Color.CLUBS;
	private Value value = Value.JACK;
	private String cardName = "Clubs_Jack";

	private CardClubsJack() {

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
