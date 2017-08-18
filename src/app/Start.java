package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.DimensionsException;
import factorycards.CardsFactory;
import factorycards.generalcardsfactory.GeneralCardsFactory;
import model.Player;
import model.card.Card;
import util.AllCardsGeneration;
import util.CardUtil;
import util.CardValidation;
import util.Menu;

public class Start {
	private static Scanner sc = new Scanner(System.in);
	private static boolean endGameAnswer;
	public static void main(String[] args) throws DimensionsException {



		CardUtil utilCard = new CardUtil();
		CardValidation cardValidation = new CardValidation();
		AllCardsGeneration generationCard = new AllCardsGeneration();
		Menu gameMenu = new Menu();
		CardsFactory generateAllCards = new GeneralCardsFactory();

		Player player = null;
		Player computer = null;

		List<Card> player1Cards = null;
		List<Card> player2Cards = null;
		List<Card> allCardsList = null;

		Card newCard = null;

		String cardValidationString;

		int gameAnswer;
		
		for (;;) {
			player = new Player();
			computer = new Player();
			System.out.println("Hello.");
			
			player1Cards = new ArrayList<>();
			player2Cards = new ArrayList<>();
			
			allCardsList = generationCard.createAllCardsList(generateAllCards);
			


			do {
				
				gameAnswer = gameMenu.gameStart(sc);
				
				switch (gameAnswer) {
				case 1:
					newCard = gameMenu.pickCard(generationCard, allCardsList);
					gameMenu.addPlayerCard(newCard, player, player1Cards);
					System.out.println("You have received a card.");
										
					System.out.println("You have " + player.getCards().size() + " card(s).");
					
					newCard = gameMenu.pickCard(generationCard, allCardsList);
					gameMenu.addPlayerCard(newCard, computer, player2Cards);
					break;
				case 2:
					System.out.println();
					System.out.println("Your score is: " + gameMenu.showScore(player));
					System.out.println();
					break;
				case 3:
					cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
					cardValidation.validateCardDimensions(cardValidationString, player, "player1");
					
					utilCard.drawOnePlayer(player, 1);
					break;
				case 4:
					cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
					cardValidation.validateCardDimensions(cardValidationString, player, "player1");
					
					cardValidationString = cardValidation.createStrigToValidate(utilCard, computer);
					cardValidation.validateCardDimensions(cardValidationString, computer, "player2");
					
					System.out.println();
					System.out.println("Your score is: " + gameMenu.showScore(player));
					System.out.println("Computer score is: " + gameMenu.showScore(computer));
					
					utilCard.drawAllPlayers(player, computer);
					endGameAnswer = gameMenu.gameEnd(sc);
					break;
				}
//				if (endGameAnswer) {
//					break;
//				}
				
			}while(gameAnswer > 0 && gameAnswer < 4);
			
			if (endGameAnswer) {
				System.out.println();
				System.out.println("End of Game !!!");
				sc.close();
				break;
			}

		}
		


		

	}
}
