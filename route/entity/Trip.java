package main.java.route.entity;

import java.util.Collection;

import main.java.enumeration.CardinalDirection;
import main.java.enumeration.RouteColor;
import main.java.enumeration.ScheduleType;
import main.java.station.entity.Station;
import main.java.vehicle.entity.Vehicle;

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
	private Vehicle vehicle;

	/**
	 * 
	 */
	public Trip() {
	}

	/**
	 * @param id
	 * @param routeNumber
	 * @param routeColor
	 * @param direction
	 * @param destination
	 * @param type
	 * @param trainRoute
	 * @param arrivals
	 * @param vehicle
	 */
	public Trip(int id, int routeNumber, RouteColor routeColor, CardinalDirection direction, Station destination, ScheduleType type,
			boolean trainRoute, Collection<Arrival> arrivals, Vehicle vehicle) {
		this.id = id;
		this.routeNumber = routeNumber;
		this.routeColor = routeColor;
		this.direction = direction;
		this.destination = destination;
		this.type = type;
		this.trainRoute = trainRoute;
		this.arrivals = arrivals;
		this.vehicle = vehicle;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param routeNumber
	 *            the routeNumber to set
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
	 * @param routeColor
	 *            the routeColor to set
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
	 * @param direction
	 *            the direction to set
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
	 * @param destination
	 *            the destination to set
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
	 * @param type
	 *            the type to set
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
	 * @param trainRoute
	 *            the trainRoute to set
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
	 * @param arrivals
	 *            the arrivals to set
	 */
	public void setArrivals(Collection<Arrival> arrivals) {
		this.arrivals = arrivals;
	}

	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle
	 *            the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
