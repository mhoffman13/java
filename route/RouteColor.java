package main.java.route;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 *
 */
public enum RouteColor {
	RED("R"),
	YELLOW("Y"),
	BLUE("B"),
	GREEN("G");
	
	private final String color;
	private static final EnumSet<RouteColor> colors = EnumSet.allOf(RouteColor.class);
	
	RouteColor(String color)
	{
		this.color = color;
	}
	
	@Override
	public String toString() {
		return this.color;
	}

	/**
	 * Returns the enum for this type.
	 */
	public static RouteColor getColor(String type){
		RouteColor color = null;
		
		for(RouteColor elem : colors) {
			if(elem.toString().equalsIgnoreCase(type)) {
				color = elem;
				break;
			}
		}		
		return color;
	}
}