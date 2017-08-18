package util;

import model.Const;
import model.Player;

public class CardUtil {


	/**
	 * Draw top line for the first player(user).
	 * @param player
	 * @return
	 */
	public String drawTopLine(Player player) {

		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();

		line.append(Const.TLC);
		for (int i = 0; i < cardCount; i++) {
			if (i < cardCount - 1) {
				line.append(Const.HL).append(Const.HL).append(Const.TJ);
			} else {
				for (int j = 0; j < Const.CARD_SIZE_X - 2; j++) {
					line.append(Const.HL);
				}
			}
		}
		
		line.append(Const.TRC);

		return line.toString();
	}
	
	/**
	 * Draw top line for the second player(computer).
	 * @param player
	 * @return
	 */
	public String drawTopLineComputer(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		line.append(Const.TLC);
		for (int i = (cardCount-1); i >= 0; i--) {
			
			if( i == (cardCount-1)) {
				for (int j = 0; j < Const.CARD_SIZE_X - 2; j++) {
					line.append(Const.HL);
				}
			} else {
				line.append(Const.TJ);
				line.append(Const.HL).append(Const.HL);
			}
		}
		line.append(Const.TRC);
		
		return line.toString();
	}
	
	/**
	 * Draw bottom line for the second player(computer).
	 * @param player
	 * @return
	 */
	public String drawBottomLineComputer(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		line.append(Const.BLC);
		for (int i = (cardCount-1); i >= 0; i--) {
			
			if( i == (cardCount-1)) {
				for (int j = 0; j < Const.CARD_SIZE_X - 2; j++) {
					line.append(Const.HL);
				}
			} else {
				line.append(Const.BJ);
				line.append(Const.HL).append(Const.HL);
			}
		}
		line.append(Const.BRC);
		
		return line.toString();
	}

	/**
	 * Draw bottom line for the first player(user).
	 * @param player
	 * @return
	 */
	public String drawBottomLine(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();

		line.append(Const.BLC);
		for (int i = 0; i < cardCount; i++) {
			if (i < cardCount - 1) {
				line.append(Const.HL).append(Const.HL).append(Const.BJ);
			} else {
				for (int j = 0; j < Const.CARD_SIZE_X - 2; j++) {
					line.append(Const.HL);
				}
			}
		}
		line.append(Const.BRC);

		return line.toString();
	}

	/**
	 * Draw number line for the first player(user).
	 * @param player
	 * @return
	 */
	public String drawNumberLine(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();

		line.append(Const.VL);
		for (int i = 0; i < cardCount; i++) {
			String cardLabel = player.getCards().get(i).getValue().getLabel();
			int cardLabelLenght = cardLabel.length();
			line.append(cardLabel);
			if (i != cardCount - 1) {
				for (int j = 0; j < 2 - cardLabelLenght; j++) {
					line.append(Const.SP);
				}
			} else {
				for (int j = 0; j < Const.CARD_SIZE_X - 2 * (cardLabelLenght) - 2; j++) {
					line.append(Const.SP);
				}
				line.append(cardLabel);
			}
			line.append(Const.VL);
		}

		return line.toString();
	}
	
	/**
	 * Draw number line for the second player(computer).
	 * @param player
	 * @return
	 */
	public String drawNumberLineComputer(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		line.append(Const.VL);
		for (int i = (cardCount-1); i >= 0; i--) {
			String cardLabel = player.getCards().get(i).getValue().getLabel();
			int cardLabelLenght = cardLabel.length();
			if(i == (cardCount-1)) {
				line.append(cardLabel);
				for (int j = 0; j < Const.CARD_SIZE_X - 2 * (cardLabelLenght) -2; j++) {
					line.append(Const.SP);
				} 
				line.append(cardLabel);
			} else {
				for (int j = 0; j < 2-cardLabelLenght; j++) {
					line.append(Const.SP);
				}
				line.append(cardLabel);
			}
			line.append(Const.VL);
		}
		
		return line.toString();
	}

	/**
	 * Draw color line for the first player(user).
	 * @param player
	 * @return
	 */
	public String drawColorLine(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();

		line.append(Const.VL);
		for (int i = 0; i < cardCount; i++) {
			char cardColor = player.getCards().get(i).getColor().getColor();
			line.append(Const.SP);
			line.append(cardColor);
			
			if(i == cardCount - 1) {
				for (int j = 0; j < Const.CARD_SIZE_X - 6; j++) {
					line.append(Const.SP);
				}
				line.append(cardColor);
				line.append(Const.SP);
			}			
			line.append(Const.VL);
		}
		
		return line.toString();
	}

	/**
	 * Draw color line for the second player(computer).
	 * @param player
	 * @return
	 */
	public String drawColorLineComputer(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		line.append(Const.VL);
		for (int i = (cardCount-1); i >= 0; i--) {
			char cardColor = player.getCards().get(i).getColor().getColor();

			if(i == (cardCount-1)) {
				line.append(Const.SP);
				line.append(cardColor);
				for (int j = 0; j < Const.CARD_SIZE_X - 6; j++) {
					line.append(Const.SP);
				}
				line.append(cardColor);	
				line.append(Const.SP);
			} else {
				line.append(Const.SP);
				line.append(cardColor);				
			}
			line.append(Const.VL);
		}
		return line.toString();
		
	}
	
	/**
	 * Draw empty line for the first player(user).
	 * @param player
	 * @return
	 */
	public String drawEmptyLine(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();

		line.append(Const.VL);
		for (int i = 0; i < cardCount; i++) {
			
			for (int j = 0; j < 2; j++) {
				line.append(Const.SP);
			}
			
			if(i == cardCount - 1) {
				for (int j = 0; j < Const.CARD_SIZE_X - 4; j++) {
					line.append(Const.SP);
				}
				
			}
			line.append(Const.VL);
		}
		

		return line.toString();
	}
	
	/**
	 * Draw empty line for the second player(computer).
	 * @param player
	 * @return
	 */
	public String drawEmptyLineComputer(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		line.append(Const.VL);
		for(int i = (cardCount-1); i >= 0; i--) {
			
			if(i == (cardCount-1)) {
				for (int j = 0; j < Const.CARD_SIZE_X - 2; j++) {
					line.append(Const.SP);
				}
			} else {
				for (int j = 0; j < 2; j++) {
					line.append(Const.SP);
				}
			}
			line.append(Const.VL);
		}
		
		return line.toString();
	}

	/**
	 * Draw all cards of both players.
	 * 
	 * @param player1
	 * @param player2
	 */
	public void drawAllPlayers(Player player1, Player player2) {
		System.out.print(drawTopLine(player1));
		System.out.printf("%30s\n", drawTopLineComputer(player2));
		System.out.print(drawNumberLine(player1));
		System.out.printf("%30s\n", drawNumberLineComputer(player2));
		System.out.print(drawColorLine(player1));
		System.out.printf("%30s\n", drawColorLineComputer(player2));
		for (int i = 0; i < Const.CARD_SIZE_Y - 6; i++) {
			System.out.print(drawEmptyLine(player1));
			System.out.printf("%30s\n", drawEmptyLineComputer(player2));
		}
		System.out.print(drawColorLine(player1));
		System.out.printf("%30s\n", drawColorLineComputer(player2));
		System.out.print(drawNumberLine(player1));
		System.out.printf("%30s\n", drawNumberLineComputer(player2));
		System.out.print(drawBottomLine(player1));
		System.out.printf("%30s\n", drawBottomLineComputer(player2));
	}
	
	/**
	 * Draw all cards of one player.
	 * 
	 * @param player
	 */
	public void drawOnePlayer(Player player, int branch) {

		switch (branch) {
		case 1:
			System.out.println(drawTopLine(player));
			System.out.println(drawNumberLine(player));
			System.out.println(drawColorLine(player));
			for (int i = 0; i < Const.CARD_SIZE_Y - 6; i++) {
				System.out.println(drawEmptyLine(player));
			}
			System.out.println(drawColorLine(player));
			System.out.println(drawNumberLine(player));
			System.out.println(drawBottomLine(player));
			break;
		case 2:
			System.out.println(drawTopLineComputer(player));
			System.out.println(drawNumberLineComputer(player));
			System.out.println(drawColorLineComputer(player));
			for (int i = 0; i < Const.CARD_SIZE_Y - 6; i++) {
				System.out.println(drawEmptyLineComputer(player));
			}
			System.out.println(drawColorLineComputer(player));
			System.out.println(drawNumberLineComputer(player));
			System.out.println(drawBottomLineComputer(player));
			break;
		}

	}

}
