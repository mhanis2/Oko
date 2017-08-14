package model.card;

public class Card {

	private Color color;
	private Value value;

	public Card(Color color, Value value) {
		this.color = color;
		this.value = value;
	}

	public Card() {

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

}
