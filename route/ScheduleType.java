package main.java.route;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 *
 */
public enum ScheduleType {
	WEEKDAY("W"),
	SATURDAY("S"),
	SUNDAY("U"),
	HOLIDAY("H");
	
	private final String type;
	private static final EnumSet<ScheduleType> scheduleTypes = EnumSet.allOf(ScheduleType.class);
	
	ScheduleType(String type)
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
	public static ScheduleType getScheduleType(String type){
		ScheduleType scheduleType = null;
		
		for(ScheduleType elem : scheduleTypes) {
			if(elem.toString().equalsIgnoreCase(type)) {
				scheduleType = elem;
				break;
			}
		}		
		return scheduleType;
	}
}