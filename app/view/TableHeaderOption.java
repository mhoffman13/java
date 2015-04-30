package main.java.app.view;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import main.java.enumeration.DistributionType;
import main.java.route.entity.Trip;

/**
 * @author meredith hoffman
 * This enum defines the tables for viewing in the app.
 */
public enum TableHeaderOption {
	INFO(1, "Information"),
	TRIPS(1, "Routes"),
	ARRIVALS(2, "Arrivals"),
	CARDS(3, "Breeze Cards"),
	TAPS(4, "Card Taps"),
	PAYMENTS(5, "Card Payments"), 
	REG_CARDS(6, "Registered Cards"), 
	CUSTOMERS(7,"Customers"), 
	STATIONS(8,"Train Stations"), 
	STOPS(9, "Bus Stops"), 
	TRAINS(10, "Trains"), 
	BUSES(11, "Buses"),
	NOTIFICATION(12, "Notifications");
	
	private Trip trip = new Trip();
	private String name = trip.getDestination().getName();
	
	private int displayOrder;
	private final String displayName;
	private static final EnumSet<TableHeaderOption> tabOptions = EnumSet.allOf(TableHeaderOption.class);

	private TableHeaderOption(int displayOrder, String displayName) {
		this.displayOrder = displayOrder;
		this.displayName = displayName;
	}

	public int getDisplayCode() {
		return displayOrder;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static List<TableHeaderOption> getTabOptions(){
		
		List<TableHeaderOption> options = new ArrayList<TableHeaderOption>(tabOptions.size());
		for( TableHeaderOption opt : tabOptions) {
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