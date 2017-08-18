package model.card;

import model.Const;

public enum Value {
	SEVEN(Const.SEVEN, 7), EIGHT(Const.EIGHT, 8), NINE(Const.NINE, 9), TEN(Const.TEN, 10), JACK(Const.JACK,
			1), QUEEN(Const.QUEEN, 1), KING(Const.KING, 2), ACE(Const.ACE, 11);

	private final String label;
	private final int value;


	Value(String label, int value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return this.label;
	}

	public int getValue() {
		return this.value;
	}

}
