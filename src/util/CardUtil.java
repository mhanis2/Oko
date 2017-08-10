package util;

import factorycards.cards.Card;
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
		int hlCount = (cardCount - 1) * 3 + Const.CARD_SIZE_X - 2;

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
		int hlCount = (cardCount - 1)*3 + Const.CARD_SIZE_X - 2;
		
		line.append(Const.TLC);
		for (int i = 0; i < cardCount; i++) {
			
			if( i == 0) {
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
		int hlCount = (cardCount - 1)*3 + Const.CARD_SIZE_X - 2;
		
		line.append(Const.BLC);
		for (int i = 0; i < cardCount; i++) {
			
			if( i == 0) {
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
		int hlCount = (cardCount - 1) * 3 + Const.CARD_SIZE_X - 2;

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
			for (int j = 0; j < 2 - cardLabelLenght; j++) {
				line.append(Const.SP);
			}
			if (i == cardCount -1) {
				for (int j = 0; j < Const.CARD_SIZE_X - 2 * (1 + cardLabelLenght) - 1; j++) {
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
	public String drawNumberLinceComputer(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		line.append(Const.VL);
		for (int i = 0; i < cardCount; i++) {
			String cardLabel = player.getCards().get(i).getValue().getLabel();
			int cardLabelLenght = cardLabel.length();
			if(i == 0) {
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
		for (int i = 0; i < cardCount; i++) {
			char cardColor = player.getCards().get(i).getColor().getColor();

			if(i == 0) {
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
	public String drawEmpytLineComputer(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCards().size();
		
		line.append(Const.VL);
		for(int i = 0; i < cardCount; i++) {
			
			if(i == 0) {
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
	 * Draw all cards of both users.
	 * @param player
	 * @param player2
	 */
	public void drawPlayer(Player player, Player player2) {
		System.out.print(drawTopLine(player));
		System.out.printf("%30s\n", drawTopLineComputer(player2));
		System.out.print(drawNumberLine(player));
		System.out.printf("%30s\n", drawNumberLinceComputer(player2));
		System.out.print(drawColorLine(player));
		System.out.printf("%30s\n", drawColorLineComputer(player2));
		for (int i = 0; i < Const.CARD_SIZE_Y - 6; i++) {
			System.out.print(drawEmptyLine(player));
			System.out.printf("%30s\n", drawEmpytLineComputer(player2));
		}
		System.out.print(drawColorLine(player));
		System.out.printf("%30s\n", drawColorLineComputer(player2));
		System.out.print(drawNumberLine(player));
		System.out.printf("%30s\n", drawNumberLinceComputer(player2));
		System.out.print(drawBottomLine(player));
		System.out.printf("%30s\n", drawBottomLineComputer(player2));
	}
	
}
