package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.DimensionsException;
import exceptions.NoCardsException;
import factorycards.generalcardsfactory.GeneralCardsFactory;
import model.Player;
import model.Screen;
import model.card.Card;
import util.AllCardsUtil;
import util.CardUtil;
import util.CardValidation;
import util.CheckCardAppearance;
import util.PlayerUtil;
import util.ScoreEvaluation;

public class Start {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws DimensionsException {


		CardUtil utilCard = new CardUtil();
		CardValidation cardValidation = new CardValidation();
		AllCardsUtil generationCard = new AllCardsUtil();
		GeneralCardsFactory allCardCreation = new GeneralCardsFactory();
		CheckCardAppearance checkList = new CheckCardAppearance();
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
		
		for (;;) {

			player = new Player();
			computer = new Player();

			playerCards = new ArrayList<>();
			computerCards = new ArrayList<>();
			
			int continualEvaluationValue = 0;
			boolean finalGameStep = false;

			allCardsList = generationCard.createAllCardsList(allCardCreation);

			do {
				menuAnswer = screen.gameStart(sc);
				
				switch (menuAnswer) {
				case 1:
					newCard = playerUtil.pickUpCard(generationCard, allCardsList);
					playerUtil.addPlayerCard(newCard, player, playerCards);
					System.out.println("You have received a card.");

					System.out.println("You have " + playerUtil.showCardAmount(player) + " card(s).");
					System.out.println();

					newCard = playerUtil.pickUpCard(generationCard, allCardsList);
					playerUtil.addPlayerCard(newCard, computer, computerCards);

					computerScore = playerUtil.getPlayerScore(computer);
					continualEvaluationValue = scoreEvaluation.computerEvaluation(computerScore);
					break;
				case 2:
					try {
						if (checkList.checkCardAppearance(playerCards)) {
							playerScore = playerUtil.getPlayerScore(player);
							System.out.println();
							System.out.println("Your score is: " + playerScore);
							System.out.println();

							continualEvaluationValue = scoreEvaluation.playerEvaluation(playerScore);
						} else {
							throw new NoCardsException("No score to show. You have no card(s).");
						}
					} catch (NoCardsException e) {
						e.toString();
					}
					break;
				case 3:
					try {
						if (checkList.checkCardAppearance(playerCards)) {
							cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
							cardValidation.validateCardDimensions(cardValidationString, player, "player1");
							
							utilCard.drawOnePlayer(player, 1);
						} else {
							throw new NoCardsException("You have no card(s).");
						}
					} catch (NoCardsException e) {
						e.toString();
					}
					break;
				case 4:
					try{
						if(checkList.checkCardAppearance(playerCards) && checkList.checkCardAppearance(computerCards)) {
							cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
							cardValidation.validateCardDimensions(cardValidationString, player, "player1");
								
							cardValidationString = cardValidation.createStrigToValidate(utilCard, computer);
							cardValidation.validateCardDimensions(cardValidationString, computer, "player2");

							playerScore = playerUtil.getPlayerScore(player);
							computerScore = playerUtil.getPlayerScore(computer);
							System.out.println();
							System.out.println("Your score is: " + playerScore);
							System.out.println("Computer score is: " + computerScore);
							
							utilCard.drawAllPlayers(player, computer);

							System.out.println();
							scoreEvaluation.finalScoreEvaluation(playerScore, computerScore);
							System.out.println();
							finalGameStep = true;
								
						} else {
							throw new NoCardsException("No cards to show.");
						}
					} catch (NoCardsException e) {
						e.toString();
					}
					break;
				}
				
				finalGameStep = screen.continualEvaluation(continualEvaluationValue);


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
