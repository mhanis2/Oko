package util;

import java.util.List;
import java.util.Scanner;

import model.Player;
import model.card.Card;

public class Menu {


	public int gameStart(Scanner s) {

		int startGameAnswer;

		do {
			System.out.println("\nWhat do you want to do?");
			System.out.println("1)	Pick up a card.");
			System.out.println("2)	Show your score.");
			System.out.println("3)	Show your cards.");
			System.out.println("4)	End this game.");
			System.out.println();
			System.out.print("Your choice: ");
			startGameAnswer = s.nextInt();
		} while (startGameAnswer < 1 || startGameAnswer > 4);

		return startGameAnswer;

	}

	public Card pickCard(AllCardsGeneration cardGeneration, List<Card> allCards) {

		Card newCard = cardGeneration.pickUpRandomCard(allCards);
		cardGeneration.removeRandomCard(allCards, newCard);
		return newCard;
	}

	public void addPlayerCard(Card card, Player player, List<Card> playerCards) {

		playerCards.add(card);
		player.setCards(playerCards);
	}

	public int showScore(Player player) {
		int cardCount = player.getCards().size();
		int playerScore = 0;
		for (int i = 0; i < cardCount; i++) {

			playerScore += player.getCards().get(i).getValue().getValue();
		}
		return playerScore;
	}

	public boolean gameEnd(Scanner s) {
		int gameEndAnswer;
		do {
			System.out.println("You decided to leave a game or you finished the game.");
			System.out.println("What do you want to do?");
			System.out.println("1)	Start a new game.");
			System.out.println("2)	Quit the application.");
			System.out.print("Your answer: ");
			gameEndAnswer = s.nextInt();

		} while (gameEndAnswer != 1 && gameEndAnswer != 2);

		return (gameEndAnswer == 2) ? true : false;

	}
}
