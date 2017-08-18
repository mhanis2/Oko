package factorycards.generalcardsfactory;

import factorycards.CardsFactory;
import model.card.Card;
import model.card.Color;
import model.card.Value;

public class GeneralCardsFactory implements CardsFactory {

	@Override
	public Card createCard(Color color, Value label) {
		Card newCard = new Card(color, label);
		return newCard;
	}

	// @Override
	// public Card createCardClubsSeven() {
	// Card newCard = new Card(Color.CLUBS, Value.SEVEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardClubsEight() {
	// Card newCard = new Card(Color.CLUBS, Value.EIGHT);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardClubsNine() {
	// Card newCard = new Card(Color.CLUBS, Value.NINE);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardClubsTen() {
	// Card newCard = new Card(Color.CLUBS, Value.TEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardClubsJack() {
	// Card newCard = new Card(Color.CLUBS, Value.JACK);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardClubsQueen() {
	// Card newCard = new Card(Color.CLUBS, Value.QUEEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardClubsKing() {
	// Card newCard = new Card(Color.CLUBS, Value.KING);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardClubsAce() {
	// Card newCard = new Card(Color.CLUBS, Value.ACE);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsSeven() {
	// Card newCard = new Card(Color.DIAMONDS, Value.SEVEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsEight() {
	// Card newCard = new Card(Color.DIAMONDS, Value.EIGHT);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsNine() {
	// Card newCard = new Card(Color.DIAMONDS, Value.NINE);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsTen() {
	// Card newCard = new Card(Color.DIAMONDS, Value.TEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsJack() {
	// Card newCard = new Card(Color.DIAMONDS, Value.JACK);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsQueen() {
	// Card newCard = new Card(Color.DIAMONDS, Value.QUEEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsKing() {
	// Card newCard = new Card(Color.DIAMONDS, Value.KING);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardDiamondsAce() {
	// Card newCard = new Card(Color.DIAMONDS, Value.ACE);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsSeven() {
	// Card newCard = new Card(Color.HEARTS, Value.SEVEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsEight() {
	// Card newCard = new Card(Color.HEARTS, Value.EIGHT);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsNine() {
	// Card newCard = new Card(Color.HEARTS, Value.NINE);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsTen() {
	// Card newCard = new Card(Color.HEARTS, Value.TEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsJack() {
	// Card newCard = new Card(Color.HEARTS, Value.JACK);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsQueen() {
	// Card newCard = new Card(Color.HEARTS, Value.QUEEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsKing() {
	// Card newCard = new Card(Color.HEARTS, Value.KING);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardHeartsAce() {
	// Card newCard = new Card(Color.HEARTS, Value.ACE);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesSeven() {
	// Card newCard = new Card(Color.SPADES, Value.SEVEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesEight() {
	// Card newCard = new Card(Color.SPADES, Value.EIGHT);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesNine() {
	// Card newCard = new Card(Color.SPADES, Value.NINE);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesTen() {
	// Card newCard = new Card(Color.SPADES, Value.TEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesJack() {
	// Card newCard = new Card(Color.SPADES, Value.JACK);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesQueen() {
	// Card newCard = new Card(Color.SPADES, Value.QUEEN);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesKing() {
	// Card newCard = new Card(Color.SPADES, Value.KING);
	// return newCard;
	// }
	//
	// @Override
	// public Card createCardSpadesAce() {
	// Card newCard = new Card(Color.SPADES, Value.ACE);
	// return newCard;
	// }

}
