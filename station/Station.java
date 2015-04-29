package main.java.station;

import main.java.common.Address;

/**
 * @author meredith hoffman
 * This class represents the basis for both
 * bus stops and train stations.
 */
public abstract class Station {
	private int id;
	private String name;
	private Address address;
	private boolean busStation;
	private boolean trainStation;
	private boolean parking;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the busStation
	 */
	public boolean isBusStation() {
		return busStation;
	}
	/**
	 * @param busStation the busStation to set
	 */
	public void setBusStation(boolean busStation) {
		this.busStation = busStation;
	}
	/**
	 * @return the trainStation
	 */
	public boolean isTrainStation() {
		return trainStation;
	}
	/**
	 * @param trainStation the trainStation to set
	 */
	public void setTrainStation(boolean trainStation) {
		this.trainStation = trainStation;
	}
	/**
	 * @return the parking
	 */
	public boolean hasParking() {
		return parking;
	}
	/**
	 * @param parking the parking to set
	 */
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	
}
