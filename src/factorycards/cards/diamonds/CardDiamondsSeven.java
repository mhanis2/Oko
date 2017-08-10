package factorycards.cards.diamonds;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardDiamondsSeven implements Card {

	public static final CardDiamondsSeven CARD_DIAMONDS_SEVEN = new CardDiamondsSeven();

	private Color color = Color.DIAMONDS;
	private Value value = Value.SEVEN;
	private String cardName = "Diamonds_Seven";

	private CardDiamondsSeven() {

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
