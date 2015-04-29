package main.java.card.entity;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 *
 */
public enum TapType {
	TAP_IN("I"),
	TAP_OUT("O"),
	TAP_BUS("B");
	
	private final String type;
	private static final EnumSet<TapType> tapTypes = EnumSet.allOf(TapType.class);
	
	TapType(String type)
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
	public static TapType getCardType(String type){
		TapType tapType = null;
		
		for(TapType elem : tapTypes) {
			if(elem.toString().equalsIgnoreCase(type)) {
				tapType = elem;
				break;
			}
		}		
		return tapType;
	}
}