package main.java.vehicle.entity;

import main.java.enumeration.VehicleType;

/**
 * @author meredith hoffman
 * This class represents the basis for both
 * train and bus vehicles.
 */
public abstract class Vehicle {
	private int id;
	private String phone;
	private VehicleType type;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the type
	 */
	public VehicleType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(VehicleType type) {
		this.type = type;
	}
}
