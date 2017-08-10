package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesTen implements Card {

	public static final CardSpadesTen CARD_SPADES_TEN = new CardSpadesTen();

	private Color color = Color.SPADES;
	private Value value = Value.TEN;
	private String cardName = "Spades_Ten";

	private CardSpadesTen() {

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
