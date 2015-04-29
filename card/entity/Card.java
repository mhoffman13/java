package main.java.card.entity;

/**
 * @author meredith hoffman
 *
 */
public class Card {
	private String id;
	private CardType type;
	private int days;
	private int trips;
	private float money;
	private boolean registered;
	//private Customer customer;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public CardType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(CardType type) {
		this.type = type;
	}
	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(int days) {
		this.days = days;
	}
	/**
	 * @return the trips
	 */
	public int getTrips() {
		return trips;
	}
	/**
	 * @param trips the trips to set
	 */
	public void setTrips(int trips) {
		this.trips = trips;
	}
	/**
	 * @return the money
	 */
	public float getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(float money) {
		this.money = money;
	}
	/**
	 * @return the registered
	 */
	public boolean isRegistered() {
		return registered;
	}
	/**
	 * @param registered the registered to set
	 */
	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
}
