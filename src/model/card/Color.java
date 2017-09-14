package model.card;

import model.Const;

public enum Color {
	SPADES(Const.SPADES), CLUBS(Const.CLUBS), HEARTS(Const.HEARTS), DIAMONDS(Const.DIAMONDS);

	private final char color;

	Color(char color) {
		this.color = color;
	}

	/**
	 * Get color of card.
	 * 
	 * @return color of card
	 */
	public char getColor() {
		return this.color;
	}
}
