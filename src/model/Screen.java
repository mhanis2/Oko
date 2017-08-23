package model;

import java.util.Scanner;

public class Screen {

	private static Screen instance;

	/**
	 * Create instance of screen.
	 * 
	 * @return instance of screen
	 */
	public static Screen getInstance() {
		if (instance == null) {
			instance = new Screen();
		}
		return instance;
	}
	
	/**
	 * Menu for a game.
	 * 
	 * @param s
	 * @return user`s choice
	 */
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

	/**
	 * Menu after the round of game. If user wants to continue or quit a game.
	 * 
	 * @param s
	 * @return user`s choice
	 */
	public boolean gameEnd(Scanner s) {
		int gameEndAnswer;
		do {
			System.out.println();
			System.out.println("You decided to show your cards and to end the game\nor game has finished.");
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("1)	Start a new game.");
			System.out.println("2)	Quit the application.");
			System.out.print("Your answer: ");
			gameEndAnswer = s.nextInt();

		} while (gameEndAnswer != 1 && gameEndAnswer != 2);

		return (gameEndAnswer == 2) ? true : false;
	}


	/**
	 * Evaluate score during the game.
	 * 
	 * @param value
	 * @return message for user and value for ending or continuation of game.
	 */
	public boolean continualEvaluation(int value) {
		boolean finalStep = false;
		switch (value) {
		case 1:
			System.out.println("Computer get 'oko', so you have lose !!!");
			finalStep = true;
			break;
		case 2:
			System.out.println("Compter has more then 21, so you have won !!!");
			System.out.println("Congratulations !!!");
			finalStep = true;
			break;
		case 3:
			System.out.println("You get 'oko' !!!");
			System.out.println("Congratulations !!!");
			finalStep = true;
			break;
		}
		return finalStep;
	}
}
