package main.java.app.view;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import main.java.enumeration.DistributionType;

/**
 * @author meredith hoffman
 * This enum defines the tables for viewing in the app.
 */
public enum TabOption {
	INFO(1, "Information"),
	TRIPS(2, "Routes"),
	ARRIVALS(3, "Arrivals"),
	CARDS(4, "Breeze Cards"),
	TAPS(5, "Card Taps"),
	PAYMENTS(6, "Card Payments"), 
	REG_CARDS(7, "Registered Cards"), 
	CUSTOMERS(8,"Customers"), 
	STATIONS(9,"Train Stations"), 
	STOPS(10, "Bus Stops"), 
	TRAINS(11, "Trains"), 
	BUSES(12, "Buses"),
	NOTIFICATION(13, "Notifications");

	private int displayOrder;
	private final String displayName;
	private static final EnumSet<TabOption> tabOptions = EnumSet.allOf(TabOption.class);

	private TabOption(int displayOrder, String displayName) {
		this.displayOrder = displayOrder;
		this.displayName = displayName;
	}

	public int getDisplayCode() {
		return displayOrder;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static List<TabOption> getTabOptions(){
		
		List<TabOption> options = new ArrayList<TabOption>(tabOptions.size());
		for( TabOption opt : tabOptions) {
		    options.add( opt);
		}
		return options;
	}

//	public static EnumSet<TabOption> getStandardEnrollmentEvents() {
//		return standardEnrollmentEvents;
//	}
//
//	public static EnumSet<TabOption> getStandardEnrollmentEventsForAdmin() {
//		return standardEnrollmentEventsForAdmin;
//	}
}