package app;

import java.util.ArrayList;
import java.util.List;

import exceptions.DimensionsException;
import factorycards.CardsFactory;
import factorycards.generalcardsfactory.GeneralCardsFactory;
import model.Player;
import model.card.Card;
import util.CardUtil;
import util.CardValidation;

public class Start {
	public static void main(String[] args) throws DimensionsException {


		CardUtil utilCard = new CardUtil();
		CardValidation cardValidation = new CardValidation();
		
		String cardToString;

		Player player1 = new Player();

		CardsFactory player1CardsFactory = new GeneralCardsFactory();
		List<Card> player1Cards = new ArrayList<>();

		Card cardClubsAce = player1CardsFactory.createCardClubsAce();
		Card cardDiamondsKing = player1CardsFactory.createCardClubsKing();
		Card cardHeartsNine = player1CardsFactory.createCardHeartsNine();
		Card cardSpadesSeven = player1CardsFactory.createCardSpadesSeven();
		Card cardDiamondsAce = player1CardsFactory.createCardClubsAce();

		player1Cards.add(cardClubsAce);
		player1Cards.add(cardDiamondsKing);
		player1Cards.add(cardHeartsNine);
		player1Cards.add(cardSpadesSeven);
		player1Cards.add(cardDiamondsAce);
		player1.setCards(player1Cards);

		Player player2 = new Player();
		
		CardsFactory player2CardsFactory = new GeneralCardsFactory();
		List<Card> player2Cards = new ArrayList<>();
		
		Card cardHeartsEigth = player2CardsFactory.createCardHeartsEight();
		Card cardSpadesEigth = player2CardsFactory.createCardSpadesEight();
		Card cardDiamondsJack = player2CardsFactory.createCardDiamondsJack();
		Card cardSpadesTen = player2CardsFactory.createCardSpadesTen();
		Card cardSpadesAce = player2CardsFactory.createCardSpadesAce();
		
		player2Cards.add(cardHeartsEigth);
		player2Cards.add(cardSpadesEigth);
		player2Cards.add(cardDiamondsJack);
		player2Cards.add(cardSpadesTen);
		player2Cards.add(cardSpadesAce);
		player2.setCards(player2Cards);
		
		
		cardToString = cardValidation.createStrigToValidate(utilCard, player1);
		
		cardValidation.validateCardDimensions(cardToString, player1, "player1");
		
		cardToString = cardValidation.createStrigToValidate(utilCard, player2);
		
		cardValidation.validateCardDimensions(cardToString, player2, "player2");
		System.out.println();
		
		utilCard.drawPlayer(player1, player2);
	}
}
