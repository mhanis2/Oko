package util;

import java.util.List;

import model.Player;
import model.card.Card;

public class PlayerUtil {


	/**
	 * Player get a random card from all cards.
	 * 
	 * @param allCardsUtil
	 * @param allCards
	 * @return random card
	 */
	public Card pickUpCard(AllCardsUtil allCardsUtil, List<Card> allCards) {

		Card newCard = allCardsUtil.pickUpRandomCard(allCards);
		allCardsUtil.removeRandomCard(allCards, newCard);
		return newCard;
	}

	/**
	 * Add random card to player`s list of cards.
	 * 
	 * @param card
	 * @param player
	 * @param playerCards
	 */
	public void addPlayerCard(Card card, Player player, List<Card> playerCards) {

		playerCards.add(card);
		player.setCards(playerCards);
	}

	/**
	 * Show number of player`s cards.
	 * 
	 * @param player
	 * @return amount of player`s cards
	 */
	public int showCardAmount(Player player) {
		return player.getCards().size();
	}

	/**
	 * Show player`s score.
	 * 
	 * @param player
	 * @return score
	 */
	public int getPlayerScore(Player player) {
		int cardCount = player.getCards().size();
		int playerScore = 0;
		for (int i = 0; i < cardCount; i++) {

			playerScore += player.getCards().get(i).getValue().getValue();
		}
		return playerScore;
	}

}
