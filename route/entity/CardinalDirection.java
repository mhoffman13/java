package main.java.route.entity;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 *
 */
public enum CardinalDirection {
	NORTH("N"),
	SOUTH("S"),
	EAST("E"),
	WEST("W");
	
	private final String dir;
	private static final EnumSet<CardinalDirection> directions = EnumSet.allOf(CardinalDirection.class);
	
	CardinalDirection(String dir)
	{
		this.dir = dir;
	}
	
	@Override
	public String toString() {
		return this.dir;
	}

	/**
	 * Returns the enum for this type.
	 */
	public static CardinalDirection getCardinalDirection(String type){
		CardinalDirection direction = null;
		
		for(CardinalDirection elem : directions) {
			if(elem.toString().equalsIgnoreCase(type)) {
				direction = elem;
				break;
			}
		}		
		return direction;
	}
}