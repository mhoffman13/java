package main.java.route;

import java.util.Collection;

import main.java.station.Station;

/**
 * @author meredith hoffman
 *
 */
public class Trip {
	private int id;
	private int routeNumber;
	private RouteColor routeColor;
	private CardinalDirection direction;
	private Station destination;
	private ScheduleType type;
	private boolean trainRoute;
	private Collection<Arrival> arrivals;
	//private Vehicle vehicle
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the routeNumber
	 */
	public int getRouteNumber() {
		return routeNumber;
	}
	/**
	 * @param routeNumber the routeNumber to set
	 */
	public void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}
	/**
	 * @return the routeColor
	 */
	public RouteColor getRouteColor() {
		return routeColor;
	}
	/**
	 * @param routeColor the routeColor to set
	 */
	public void setRouteColor(RouteColor routeColor) {
		this.routeColor = routeColor;
	}
	/**
	 * @return the direction
	 */
	public CardinalDirection getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(CardinalDirection direction) {
		this.direction = direction;
	}
	/**
	 * @return the destination
	 */
	public Station getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Station destination) {
		this.destination = destination;
	}
	/**
	 * @return the type
	 */
	public ScheduleType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(ScheduleType type) {
		this.type = type;
	}
	/**
	 * @return the trainRoute
	 */
	public boolean isTrainRoute() {
		return trainRoute;
	}
	/**
	 * @param trainRoute the trainRoute to set
	 */
	public void setTrainRoute(boolean trainRoute) {
		this.trainRoute = trainRoute;
	}
	/**
	 * @return the arrivals
	 */
	public Collection<Arrival> getArrivals() {
		return arrivals;
	}
	/**
	 * @param arrivals the arrivals to set
	 */
	public void setArrivals(Collection<Arrival> arrivals) {
		this.arrivals = arrivals;
	}
}
