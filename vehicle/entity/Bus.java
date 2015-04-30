package main.java.vehicle.entity;

/**
 * @author meredith hoffman
 * This class represents a MARTA bus in its
 * most basic sense.
 */
public class Bus extends Vehicle {
	private int capacity;
	private String vin;
	/**
	 * @return the carCount
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the carCount to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the tin
	 */
	public String getVin() {
		return vin;
	}
	/**
	 * @param vin the tin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}
	
}
