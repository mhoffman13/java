package main.java.card.entity;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 *
 */
public enum CardType {
	GENERAL("G"),
	STUDENT("S"),
	EMPLOYER("E"),
	DISABILITY("D"),
	SENIOR("R");
	
	private final String type;
	private static final EnumSet<CardType> cardTypes = EnumSet.allOf(CardType.class);
	
	CardType(String type)
	{
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}

	/**
	 * Returns the enum for this type.
	 */
	public static CardType getCardType(String type){
		CardType cardType = null;
		
		for(CardType elem : cardTypes) {
			if(elem.toString().equalsIgnoreCase(type)) {
				cardType = elem;
				break;
			}
		}		
		return cardType;
	}
}