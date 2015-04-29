/**
 * 
 */
package main.java.station.entity;

/**
 * @author meredith hoffman
 * This class represents a MARTA bus stop. The
 * information here is intended to assist in the
 * tracking of the MARTA transportation system.
 */
public class BusStop extends Station{
	private float latitude;
	private float longitude;
	private boolean shelter;
	private boolean bench;
	/**
	 * @return the latitude
	 */
	public float getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public float getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the shelter
	 */
	public boolean isShelter() {
		return shelter;
	}
	/**
	 * @param shelter the shelter to set
	 */
	public void setShelter(boolean shelter) {
		this.shelter = shelter;
	}
	/**
	 * @return the bench
	 */
	public boolean isBench() {
		return bench;
	}
	/**
	 * @param bench the bench to set
	 */
	public void setBench(boolean bench) {
		this.bench = bench;
	}
	
}
