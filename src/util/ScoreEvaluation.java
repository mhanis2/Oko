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
	 * Evaluate player`s score.
	 * 
	 * @param playerScore
	 * @return value for Screen method to evaluate score
	 */
	public int playerEvaluation(int playerScore) {
		int x;
		if (playerScore == 21) {
			x = 3;
		} else {
			x = 0;
		}

		return x;
	}

	/**
	 * Evaluate score of computer.
	 * 
	 * @param computerScore
	 * @return value for Screen method to evaluate score
	 */
	public int computerEvaluation(int computerScore) {
		int y;
		if (computerScore == 21) {
			y = 1;
		} else if (computerScore > 21) {
			y = 2;
		} else {
			y = 0;
		}

		return y;
	}
}
