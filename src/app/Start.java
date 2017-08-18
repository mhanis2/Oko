package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.DimensionsException;
import exceptions.NoCardsException;
import factorycards.CardsFactory;
import factorycards.generalcardsfactory.GeneralCardsFactory;
import model.Player;
import model.card.Card;
import util.AllCardsGeneration;
import util.CardUtil;
import util.CardValidation;
import util.CheckCardAppearance;
import util.Menu;

public class Start {
	private static Scanner sc = new Scanner(System.in);
	private static boolean endGameAnswer;
	public static void main(String[] args) throws DimensionsException, NoCardsException {


		CardUtil utilCard = new CardUtil();
		CardValidation cardValidation = new CardValidation();
		AllCardsGeneration generationCard = new AllCardsGeneration();
		CheckCardAppearance checkList = new CheckCardAppearance();
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
			System.out.println("Hello player :)");
			
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
					try {
						if (checkList.checkCardAppearance(player1Cards)) {
							System.out.println();
							System.out.println("Your score is: " + gameMenu.showScore(player));
							System.out.println();
						} else {
							throw new NoCardsException("No score to show. You have no card(s).");
						}
					} catch (NoCardsException e) {
						e.toString();
					}
					break;
				case 3:
					try {
						if (checkList.checkCardAppearance(player1Cards)) {
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
						if(checkList.checkCardAppearance(player1Cards) && checkList.checkCardAppearance(player2Cards)) {
							cardValidationString = cardValidation.createStrigToValidate(utilCard, player);
							cardValidation.validateCardDimensions(cardValidationString, player, "player1");
								
							cardValidationString = cardValidation.createStrigToValidate(utilCard, computer);
							cardValidation.validateCardDimensions(cardValidationString, computer, "player2");
								
							System.out.println();
							System.out.println("Your score is: " + gameMenu.showScore(player));
							System.out.println("Computer score is: " + gameMenu.showScore(computer));
							
							utilCard.drawAllPlayers(player, computer);
							endGameAnswer = gameMenu.gameEnd(sc);
								
						} else {
							throw new NoCardsException("No cards to show.");
						}
					} catch (NoCardsException e) {
						e.toString();
						endGameAnswer = false;
					} 
					break;
				
				}
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
