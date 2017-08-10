package factorycards.cards.hearts;

import factorycards.cards.Card;
import model.card.Color;
import model.card.Value;

public class CardHeartsAce implements Card {

	public static final CardHeartsAce CARD_HEARTS_ACE = new CardHeartsAce();

	private Color color = Color.CLUBS;
	private Value value = Value.ACE;
	private String cardName = "Hearts_Ace";

	private CardHeartsAce() {

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

		return cardName;
	}



}
