package main.java.payment.entity;

import java.util.Date;

import main.java.card.entity.Card;
import main.java.enumeration.ServiceType;
import main.java.station.entity.Terminal;

/**
 * @author meredith hoffman
 *
 */
public class Payment {
	private String id;
	private Card card;
	private Date paymentDate;
	private ServiceType servicePurchased;
	private double quantityPurchased; // i.e. 2 days, 5 trips, or 15.50 dollars
	private char paymentType;
	private Terminal paymentTerminal;
	//private Customer payingCustomer;
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
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}
	/**
	 * @param card the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}
	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}
	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	/**
	 * @return the servicePurchased
	 */
	public ServiceType getServicePurchased() {
		return servicePurchased;
	}
	/**
	 * @param servicePurchased the servicePurchased to set
	 */
	public void setServicePurchased(ServiceType servicePurchased) {
		this.servicePurchased = servicePurchased;
	}
	/**
	 * @return the quantityPurchased
	 */
	public double getQuantityPurchased() {
		return quantityPurchased;
	}
	/**
	 * @param quantityPurchased the quantityPurchased to set
	 */
	public void setQuantityPurchased(double quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	/**
	 * @return the paymentType
	 */
	public char getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(char paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the paymentTerminal
	 */
	public Terminal getPaymentTerminal() {
		return paymentTerminal;
	}
	/**
	 * @param paymentTerminal the paymentTerminal to set
	 */
	public void setPaymentTerminal(Terminal paymentTerminal) {
		this.paymentTerminal = paymentTerminal;
	}
	
}
