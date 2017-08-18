package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import factorycards.CardsFactory;
import model.card.Card;
import model.card.Color;
import model.card.Value;

public class AllCardsGeneration {

	private Random generator = new Random();

	Color[] colorCard = { Color.SPADES, Color.DIAMONDS, Color.HEARTS, Color.CLUBS };
	Value[] labelCard = { Value.SEVEN, Value.EIGHT, Value.NINE, Value.TEN, Value.JACK, Value.KING, Value.QUEEN,
			Value.ACE };

	public List<Card> createAllCardsList(CardsFactory factoryCard) {
		List<Card> allCardsList = new ArrayList<>();

		for (int i = 0; i < colorCard.length; i++) {
			for (int y = 0; y < 8; y++) {
				allCardsList.add(factoryCard.createCard(colorCard[i], labelCard[y]));
			}
		}
		return allCardsList;
	}

	public Card pickUpRandomCard(List<Card> allCardsList) {

		int randomCardListIndex;
		randomCardListIndex = generator.nextInt(allCardsList.size());

		return allCardsList.get(randomCardListIndex);

	}

	public void removeRandomCard(List<Card> allCardsList, Card card) {
		allCardsList.remove(card);
	}
}
