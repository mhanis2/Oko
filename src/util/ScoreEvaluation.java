package util;

public class ScoreEvaluation {

	/**
	 * Evaluate player`s score and score of a computer.
	 * 
	 * @param playerScore
	 * @param computerScore
	 */
	public void finalScoreEvaluation(int playerScore, int computerScore) {

		if (playerScore < 22 && computerScore < 22) {
			if (playerScore == computerScore) {
				System.out.println("Tie.");
			}
			System.out.println(
					(playerScore > computerScore) ? "You have won.\nCongratulations !!!"
							: "Computer has won and you have lose.");
		} else {
			if (playerScore > 21 && computerScore > 21) {
				System.out.println("Both has lose.");
			} else {
				System.out.println((playerScore > 21) ? "You have lose."
						: "Computer has lose and you have won.\nCongratulations !!!");
			}
		}
	}

	/**
	 * Evaluation score of both players.
	 * 
	 * @param playerScore
	 * @param computerScore
	 * @return value for method continualEvaluation(value) in Screen class to
	 *         evaluate score
	 */
	public int scoreEvaluation(int playerScore, int computerScore) {
		int x;

		if (computerScore == 21) {
			x = 1;
		} else if (computerScore > 21) {
			x = 2;
		} else if (playerScore == 21) {
			x = 3;
		} else if (playerScore > 21) {
			x = 4;
		} else {
			x = 0;
		}

		return x;
	}

	/**
	 * Evaluate score during the game.
	 * 
	 * @param value
	 * @return message for user and value for ending or continuation of game
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
		case 4:
			System.out.println("You have more then 21 points.");
			System.out.println("You have lost.");
			finalStep = true;
			break;
		}

		return finalStep;
	}
}
