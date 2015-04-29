package main.java.route.entity;

import java.util.Date;

import main.java.station.entity.Station;

/**
 * @author meredith hoffman
 *
 */
public class Arrival {
	private int id;
	private Date arrival;
	private Station station;
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
	public Date getArrival() {
		return arrival;
	}
	/**
	 * @param arrival the arrival to set
	 */
	public void setArrival(Date arrival) {
		this.arrival = arrival;
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
	
}
