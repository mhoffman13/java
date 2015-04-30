package main.java.route.entity;

import java.util.Date;

import main.java.station.entity.Station;

/**
 * @author meredith hoffman
 *
 */
public class Arrival {
	private int id;
	private Date arrivalTime;
	private Station station;
	private Trip trip;
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
	 * @return the arrival
	 */
	public Date getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrival the arrival to set
	 */
	public void setArrivalTime(Date arrival) {
		this.arrivalTime = arrival;
	}
	/**
	 * @return the station
	 */
	public Station getStation() {
		return station;
	}
	/**
	 * @param station the station to set
	 */
	public void setStation(Station station) {
		this.station = station;
	}
	/**
	 * @return the trip
	 */
	public Trip getTrip() {
		return trip;
	}
	/**
	 * @param trip the trip to set
	 */
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	
}
