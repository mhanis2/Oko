package model.card;

import model.Const;

public enum Color {
	SPADES(Const.SPADES), CLUBS(Const.CLUBS), HEARTS(Const.HEARTS), DIAMONDS(Const.DIAMONDS);

	private final char color;

	Color(char color) {
		this.color = color;
	}

	public char getColor() {
		return this.color;
	}
}
