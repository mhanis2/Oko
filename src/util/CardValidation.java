package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.DimensionsException;
//import factorycards.cards.Card;
import model.Const;
import model.Player;

public class CardValidation {

	/**
	 * Card validation of specified user.
	 * @param stringCard
	 * @param player
	 * @param nameOfUser
	 * @throws DimensionsException
	 */
	public void validateCardDimensions(String stringCard, Player player, String nameOfUser) throws DimensionsException {

		String userName = nameOfUser;
		int numberOfCards = player.getCards().size();
		int numberOfCharacters = 15 + (numberOfCards -1) * 3;
		String regPattern = "([\\d\\w\\W]{" + numberOfCharacters + "}\\n)";
		String lastRegPattern = "[\\d\\w\\W]{" + numberOfCharacters + "}";
		
		Pattern pattern = Pattern.compile(
				regPattern + "{9}" + lastRegPattern,
				Pattern.MULTILINE);

		Matcher matcher = pattern.matcher(stringCard);

		if (matcher.matches()) {
			System.out.println("Dimensions of card(s) of " + userName + " are ok.");
			;
		} else {
			throw new DimensionsException("Dimensions of card(s) " + userName + " are invalid.");
		}
	}

	/**
	 * Creating String of card for validation.
	 * @param cardutil
	 * @param player
	 * @return card in String format
	 */
	public String createStrigToValidate(CardUtil cardutil, Player player) {
		StringBuilder cardString = new StringBuilder();
		cardString.append(cardutil.drawTopLine(player));
		cardString.append("\n");
		cardString.append(cardutil.drawNumberLine(player));
		cardString.append("\n");
		cardString.append(cardutil.drawColorLine(player));
		cardString.append("\n");
		for (int i = 0; i < Const.CARD_SIZE_Y - 6; i++) {
			cardString.append(cardutil.drawEmptyLine(player));
			cardString.append("\n");
		}
		cardString.append(cardutil.drawColorLine(player));
		cardString.append("\n");
		cardString.append(cardutil.drawNumberLine(player));
		cardString.append("\n");
		cardString.append(cardutil.drawBottomLine(player));

		return cardString.toString();
	}
}
