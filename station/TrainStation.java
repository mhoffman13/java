package main.java.station;

import java.util.Collection;

/**
 * @author meredith hoffman
 * This class represents a MARTA train station.
 * The information here is intended to assist in
 * the tracking of the MARTA transportation
 * system.
 */
public class TrainStation extends Station {
	private int capacity;
	private boolean restroom;
	private boolean onYellowLine;
	private boolean onRedLine;
	private boolean onBlueLine;
	private boolean onGreenLine;
	private Collection<Terminal> terminals;
	
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the restroom
	 */
	public boolean isRestroom() {
		return restroom;
	}
	/**
	 * @param restroom the restroom to set
	 */
	public void setRestroom(boolean restroom) {
		this.restroom = restroom;
	}
	/**
	 * @return the onYellowLine
	 */
	public boolean isOnYellowLine() {
		return onYellowLine;
	}
	/**
	 * @param onYellowLine the onYellowLine to set
	 */
	public void setOnYellowLine(boolean onYellowLine) {
		this.onYellowLine = onYellowLine;
	}
	/**
	 * @return the onRedLine
	 */
	public boolean isOnRedLine() {
		return onRedLine;
	}
	/**
	 * @param onRedLine the onRedLine to set
	 */
	public void setOnRedLine(boolean onRedLine) {
		this.onRedLine = onRedLine;
	}
	/**
	 * @return the onBlueLine
	 */
	public boolean isOnBlueLine() {
		return onBlueLine;
	}
	/**
	 * @param onBlueLine the onBlueLine to set
	 */
	public void setOnBlueLine(boolean onBlueLine) {
		this.onBlueLine = onBlueLine;
	}
	/**
	 * @return the onGreenLine
	 */
	public boolean isOnGreenLine() {
		return onGreenLine;
	}
	/**
	 * @param onGreenLine the onGreenLine to set
	 */
	public void setOnGreenLine(boolean onGreenLine) {
		this.onGreenLine = onGreenLine;
	}
	/**
	 * @return the terminals
	 */
	public Collection<Terminal> getTerminals() {
		return terminals;
	}
	/**
	 * @param terminals the terminals to set
	 */
	public void setTerminals(Collection<Terminal> terminals) {
		this.terminals = terminals;
	}
	
}
