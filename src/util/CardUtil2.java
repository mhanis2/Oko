package util;

import factorycards.cards.Card;
import model.Const;

public class CardUtil2 {

	public void drawCard(Card card) {
		String label = card.getValue().getLabel();
		char color = card.getColor().getColor();

		System.out.println(drawTopLine());
		System.out.println(drawNumberLine(label));
		System.out.println(drawColorLine(color));
		for (int i = 0; i < Const.CARD_SIZE_Y - 6; i++) {
			System.out.println(drawEmptyLine());
		}
		System.out.println(drawColorLine(color));
		System.out.println(drawNumberLine(label));
		System.out.println(drawBottomLine());
	}

	public String drawTopLine() {
		StringBuilder line = new StringBuilder();
		line.append(Const.TLC);
		for (int i = 0; i < Const.CARD_SIZE_X - 2; i++) {
			line.append(Const.HL);
		}
		line.append(Const.TRC);

		return line.toString();
	}

	public String drawBottomLine() {
		StringBuilder line = new StringBuilder();
		line.append(Const.BLC);
		for (int i = 0; i < Const.CARD_SIZE_X - 2; i++) {
			line.append(Const.HL);
		}
		line.append(Const.BRC);

		return line.toString();
	}

	public String drawNumberLine(String cardLabel) {
		StringBuilder line = new StringBuilder();
		
		line.append(Const.VL);
		line.append(cardLabel);
		for (int i = 0; i < Const.CARD_SIZE_X - 2 - cardLabel.length() * 2; i++) {
			line.append(Const.SP);
		}
		line.append(cardLabel);
		line.append(Const.VL);

		return line.toString();
	}

	public String drawColorLine(char color) {
		StringBuilder line = new StringBuilder();

		line.append(Const.VL);
		line.append(Const.SP);
		line.append(color);
		for (int i = 0; i < Const.CARD_SIZE_X - 6; i++) {
			line.append(Const.SP);
		}
		line.append(color);
		line.append(Const.SP);
		line.append(Const.VL);

		return line.toString();
	}

	public String drawEmptyLine() {
		StringBuilder line = new StringBuilder();

		line.append(Const.VL);
		for (int i = 0; i < Const.CARD_SIZE_X - 2; i++) {
			line.append(Const.SP);
		}
		line.append(Const.VL);

		return line.toString();
	}
}
