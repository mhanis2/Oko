package factorycards.cards.spades;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardSpadesSeven implements Card {

	public static final CardSpadesSeven CARD_SPADES_SEVEN = new CardSpadesSeven();

	private Color color = Color.SPADES;
	private Value value = Value.SEVEN;
	private String cardName = "Spades_Seven";

	private CardSpadesSeven() {

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
