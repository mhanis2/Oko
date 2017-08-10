package factorycards.generalcardsfactory;

import factorycards.CardsFactory;
import factorycards.cards.Card;
import factorycards.cards.clubs.CardClubsAce;
import factorycards.cards.clubs.CardClubsEight;
import factorycards.cards.clubs.CardClubsJack;
import factorycards.cards.clubs.CardClubsKing;
import factorycards.cards.clubs.CardClubsNine;
import factorycards.cards.clubs.CardClubsQueen;
import factorycards.cards.clubs.CardClubsSeven;
import factorycards.cards.clubs.CardClubsTen;
import factorycards.cards.diamonds.CardDiamondsAce;
import factorycards.cards.diamonds.CardDiamondsEight;
import factorycards.cards.diamonds.CardDiamondsJack;
import factorycards.cards.diamonds.CardDiamondsKing;
import factorycards.cards.diamonds.CardDiamondsNine;
import factorycards.cards.diamonds.CardDiamondsQueen;
import factorycards.cards.diamonds.CardDiamondsSeven;
import factorycards.cards.diamonds.CardDiamondsTen;
import factorycards.cards.hearts.CardHeartsAce;
import factorycards.cards.hearts.CardHeartsEight;
import factorycards.cards.hearts.CardHeartsJack;
import factorycards.cards.hearts.CardHeartsKing;
import factorycards.cards.hearts.CardHeartsNine;
import factorycards.cards.hearts.CardHeartsQueen;
import factorycards.cards.hearts.CardHeartsSeven;
import factorycards.cards.hearts.CardHeartsTen;
import factorycards.cards.spades.CardSpadesAce;
import factorycards.cards.spades.CardSpadesEight;
import factorycards.cards.spades.CardSpadesJack;
import factorycards.cards.spades.CardSpadesKing;
import factorycards.cards.spades.CardSpadesNine;
import factorycards.cards.spades.CardSpadesQueen;
import factorycards.cards.spades.CardSpadesSeven;
import factorycards.cards.spades.CardSpadesTen;

public class GeneralCardsFactory implements CardsFactory {

	@Override
	public Card createCardClubsSeven() {

		return CardClubsSeven.CARD_CLUBS_SEVEN;
	}

	@Override
	public Card createCardClubsEight() {
		;
		return CardClubsEight.CARD_CLUBS_EIGHT;
	}

	@Override
	public Card createCardClubsNine() {

		return CardClubsNine.CARD_CLUBS_NINE;
	}

	@Override
	public Card createCardClubsTen() {

		return CardClubsTen.CARD_CLUBS_TEN;
	}

	@Override
	public Card createCardClubsJack() {

		return CardClubsJack.CARD_CLUBS_JACK;
	}

	@Override
	public Card createCardClubsQueen() {

		return CardClubsQueen.CARD_CLUBS_QUEEN;
	}

	@Override
	public Card createCardClubsKing() {

		return CardClubsKing.CARD_CLUBS_KING;
	}

	@Override
	public Card createCardClubsAce() {

		return CardClubsAce.CARD_CLUBS_ACE;
	}

	@Override
	public Card createCardDiamondsSeven() {

		return CardDiamondsSeven.CARD_DIAMONDS_SEVEN;
	}

	@Override
	public Card createCardDiamondsEight() {

		return CardDiamondsEight.CARD_DIAMONDS_EIGHT;
	}

	@Override
	public Card createCardDiamondsNine() {

		return CardDiamondsNine.CARD_DIAMONDS_NINE;
	}

	@Override
	public Card createCardDiamondsTen() {

		return CardDiamondsTen.CARD_DIAMONDS_TEN;
	}

	@Override
	public Card createCardDiamondsJack() {

		return CardDiamondsJack.CARD_DIAMONDS_JACK;
	}

	@Override
	public Card createCardDiamondsQueen() {

		return CardDiamondsQueen.CARD_DIAMONDS_QUEEN;
	}

	@Override
	public Card createCardDiamondsKing() {

		return CardDiamondsKing.CARD_DIAMONDS_KING;
	}

	@Override
	public Card createCardDiamondsAce() {

		return CardDiamondsAce.CARD_DIAMONDS_ACE;
	}

	@Override
	public Card createCardHeartsSeven() {

		return CardHeartsSeven.CARD_HEARTS_SEVEN;
	}

	@Override
	public Card createCardHeartsEight() {

		return CardHeartsEight.CARD_HEARTS_EIGHT;
	}

	@Override
	public Card createCardHeartsNine() {

		return CardHeartsNine.CARD_HEARTS_NINE;
	}

	@Override
	public Card createCardHeartsTen() {

		return CardHeartsTen.CARD_HEARTS_TEN;
	}

	@Override
	public Card createCardHeartsJack() {

		return CardHeartsJack.CARD_HEARTS_JACK;
	}

	@Override
	public Card createCardHeartsQueen() {

		return CardHeartsQueen.CARD_HEARTS_QUEEN;
	}

	@Override
	public Card createCardHeartsKing() {

		return CardHeartsKing.CARD_HEARTS_KING;
	}

	@Override
	public Card createCardHeartsAce() {

		return CardHeartsAce.CARD_HEARTS_ACE;
	}

	@Override
	public Card createCardSpadesSeven() {

		return CardSpadesSeven.CARD_SPADES_SEVEN;
	}

	@Override
	public Card createCardSpadesEight() {

		return CardSpadesEight.CARD_SPADES_EIGHT;
	}

	@Override
	public Card createCardSpadesNine() {

		return CardSpadesNine.CARD_SPADES_NINE;
	}

	@Override
	public Card createCardSpadesTen() {

		return CardSpadesTen.CARD_SPADES_TEN;
	}

	@Override
	public Card createCardSpadesJack() {

		return CardSpadesJack.CARD_SPADES_JACK;
	}

	@Override
	public Card createCardSpadesQueen() {

		return CardSpadesQueen.CARD_SPADES_QUEEN;
	}

	@Override
	public Card createCardSpadesKing() {

		return CardSpadesKing.CARD_SPADES_KING;
	}

	@Override
	public Card createCardSpadesAce() {

		return CardSpadesAce.CARD_SPADES_ACE;
	}



}
