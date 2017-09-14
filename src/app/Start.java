package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.DimensionsException;
import factorycards.generalcardsfactory.GeneralCardsFactory;
import model.Player;
import model.Screen;
import model.card.Card;
import util.AllCardsUtil;
import util.CardUtil;
import util.CardValidation;
import util.PlayerUtil;
import util.ScoreEvaluation;

public class Start {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws DimensionsException {


		CardUtil utilCard = new CardUtil();
		CardValidation cardValidation = new CardValidation();
		AllCardsUtil generationCard = new AllCardsUtil();
		GeneralCardsFactory allCardCreation = new GeneralCardsFactory();
		PlayerUtil playerUtil = new PlayerUtil();
		ScoreEvaluation scoreEvaluation = new ScoreEvaluation();
		Screen screen = Screen.getInstance();

		Player player = null;
		Player computer = null;

		List<Card> playerCards = null;
		List<Card> computerCards = null;
		List<Card> allCardsList = null;

		Card newCard = null;
		String cardValidationString;
		int playerScore;
		int computerScore;
		int menuAnswer;
		boolean endGameAnswer;
		String playerName = "player";
		String computerName = "computer";
		
		for (;;) {

			player = new Player();
			computer = new Player();

			playerCards = new ArrayList<>();
			computerCards = new ArrayList<>();
			
			int continualEvaluationValue = 0;
			boolean finalGameStep = false;

			allCardsList = generationCard.createAllCardsList(allCardCreation);

			newCard = playerUtil.pickUpCard(generationCard, allCardsList);
			playerUtil.addPlayerCard(newCard, player, playerCards);

			System.out.println("The Game has started :)");
			System.out.println();

			System.out.println("You have received a card.");
			System.out.println("You have " + playerUtil.showCardAmount(player) + " card(s).");
			System.out.println();

			newCard = playerUtil.pickUpCard(generationCard, allCardsList);
			playerUtil.addPlayerCard(newCard, computer, computerCards);

			System.out.println(computerName + " have received a card.");
			System.out.println(computerName + " have " + playerUtil.showCardAmount(computer) + " card(s).");
			System.out.println();

			playerScore = playerUtil.getPlayerScore(player);
			computerScore = playerUtil.getPlayerScore(computer);

			System.out.println();
			System.out.println("Your score is: " + playerScore);
			System.out.println(computerName + " score is: " + computerScore);
			System.out.println();
			System.out.println("Your (on the left) and computer (on the right) cards.");
			cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
			cardValidation.validateCardDimensions(cardValidationString, player, playerName);

			cardValidationString = cardValidation.createStrigToValidate(utilCard, computer);
			cardValidation.validateCardDimensions(cardValidationString, computer, computerName);

			utilCard.drawAllPlayers(player, computer);

			do {
				menuAnswer = screen.startGame(sc);
				
				switch (menuAnswer) {
				case 1:
					newCard = playerUtil.pickUpCard(generationCard, allCardsList);
					playerUtil.addPlayerCard(newCard, player, playerCards);
					System.out.println("You have received a card.");
					System.out.println("You have " + playerUtil.showCardAmount(player) + " card(s).");
					System.out.println();

					newCard = playerUtil.pickUpCard(generationCard, allCardsList);
					playerUtil.addPlayerCard(newCard, computer, computerCards);
					System.out.println(computerName + " have received a card.");
					System.out.println(computerName + " have " + playerUtil.showCardAmount(computer) + " card(s).");
					System.out.println();

					break;
				case 2:
					playerScore = playerUtil.getPlayerScore(player);
					System.out.println();
					System.out.println("Your score is: " + playerScore);
					System.out.println();

					computerScore = playerUtil.getPlayerScore(computer);
					System.out.println();
					System.out.println(computerName + " score is: " + computerScore);
					System.out.println();

					continualEvaluationValue = scoreEvaluation.scoreEvaluation(playerScore, computerScore);
					break;
				case 3:
					cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
					cardValidation.validateCardDimensions(cardValidationString, player, playerName);

					cardValidationString = cardValidation.createStrigToValidate(utilCard, computer);
					cardValidation.validateCardDimensions(cardValidationString, computer, computerName);

					utilCard.drawAllPlayers(player, computer);
					break;
				case 4:
					cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
					cardValidation.validateCardDimensions(cardValidationString, player, playerName);

					cardValidationString = cardValidation.createStrigToValidate(utilCard, computer);
					cardValidation.validateCardDimensions(cardValidationString, computer, computerName);

					playerScore = playerUtil.getPlayerScore(player);
					computerScore = playerUtil.getPlayerScore(computer);
					System.out.println();
					System.out.println("Your score is: " + playerScore);
					System.out.println(computerName + " score is: " + computerScore);

					utilCard.drawAllPlayers(player, computer);

					System.out.println();
					scoreEvaluation.finalScoreEvaluation(playerScore, computerScore);
					System.out.println();
					finalGameStep = true;
					break;
				}
				finalGameStep = scoreEvaluation.continualEvaluation(continualEvaluationValue);
			} while (!finalGameStep);
			
			endGameAnswer = screen.gameEnd(sc);

			if (endGameAnswer) {
				System.out.println();
				System.out.println("End of Game !!!");
				sc.close();
				break;
			}
		}
	}
}
