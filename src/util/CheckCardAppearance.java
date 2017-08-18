package util;

import java.util.List;

import model.card.Card;

public class CheckCardAppearance {

	/**
	 * Check number of cards in player`s list.
	 * @param listOfCards
	 * @return number of player`s cards
	 */
	public boolean checkCardAppearance(List<Card> listOfCards) {
		int cardCount = listOfCards.size();
		
		return (cardCount > 0) ? true : false;
	}
}
