package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsQueen implements Card {

	public static final CardDiamondsQueen CARD_DIAMONDS_QUEEN = new CardDiamondsQueen();

	private Color color = Color.DIAMONDS;
	private Value value = Value.QUEEN;
	private String cardName = "Diamonds_Queen";

	private CardDiamondsQueen() {

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
