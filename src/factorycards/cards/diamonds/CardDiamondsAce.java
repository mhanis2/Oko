package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsAce implements Card {

	public static final CardDiamondsAce CARD_DIAMONDS_ACE = new CardDiamondsAce();

	private Color color = Color.DIAMONDS;
	private Value value = Value.ACE;
	private String cardName = "Diamonds_Ace";

	private CardDiamondsAce() {

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
