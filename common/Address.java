package main.java.common;

/**
 * @author meredith hoffman
 * Basic address object. State defaults to GA
 * because station addresses are assumed to be in
 * GA (MARTA is based in GA). Customer addresses
 * can override.
 */
public class Address {
	private String streetNum;
	private String streetName;
	private String city;
	private String state = "GA";
	private String zip;
	/**
	 * @return the streetNum
	 */
	public String getStreetNum() {
		return streetNum;
	}
	/**
	 * @param streetNum the streetNum to set
	 */
	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
}
