package main.java.vehicle.entity;

/**
 * @author meredith hoffman
 * This class represents a MARTA train in its
 * most basic sense.
 */
public class Train extends Vehicle {
	private int trainCarCount;
	private String tin;
	/**
	 * @return the carCount
	 */
	public int getTrainCarCount() {
		return trainCarCount;
	}
	/**
	 * @param trainCarCount the carCount to set
	 */
	public void setTrainCarCount(int trainCarCount) {
		this.trainCarCount = trainCarCount;
	}
	/**
	 * @return the tin
	 */
	public String getTin() {
		return tin;
	}
	/**
	 * @param tin the tin to set
	 */
	public void setTin(String tin) {
		this.tin = tin;
	}
	
}
