package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import factorycards.CardsFactory;
import model.card.Card;
import model.card.Color;
import model.card.Value;

public class AllCardsUtil {

	private Random generator = new Random();

	Color[] colorCard = { Color.SPADES, Color.DIAMONDS, Color.HEARTS, Color.CLUBS };
	Value[] labelCard = { Value.SEVEN, Value.EIGHT, Value.NINE, Value.TEN, Value.JACK, Value.KING, Value.QUEEN,
			Value.ACE };

	/**
	 * Create all cards for a game.
	 * 
	 * @param generateAllCards
	 * @return List with all cards
	 */
	public List<Card> createAllCardsList(CardsFactory generateAllCards) {
		List<Card> allCardsList = new ArrayList<>();

		for (int i = 0; i < colorCard.length; i++) {
			for (int y = 0; y < 8; y++) {
				allCardsList.add(generateAllCards.createCard(colorCard[i], labelCard[y]));
			}
		}
		return allCardsList;
	}

	/**
	 * Pickup a random card from all cards.
	 * 
	 * @param allCardsList
	 * @return Random card
	 */
	public Card pickUpRandomCard(List<Card> allCardsList) {

		int randomCardListIndex;
		randomCardListIndex = generator.nextInt(allCardsList.size());

		return allCardsList.get(randomCardListIndex);

	}

	/**
	 * Remove random card from all cards.
	 * 
	 * @param allCardsList
	 * @param card
	 */
	public void removeRandomCard(List<Card> allCardsList, Card card) {
		allCardsList.remove(card);
	}
}
