package main.java.notification.entity;

import java.util.Date;

import main.java.enumeration.DistributionType;
import main.java.enumeration.NotificationCode;

/**
 * @author meredith hoffman
 * This class represents a notification in the
 * MARTA system sent to either a vehicle or a
 * station.
 */
public class Notification {
	private int id;
	private NotificationCode notificationCode;;
	private DistributionType distributionType;
	private String description;
	private Date date;
	private char code;
	private String content;
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
	 * @return the notificationCode
	 */
	public NotificationCode getNotificationCode() {
		return notificationCode;
	}
	/**
	 * @param notificationCode the notificationCode to set
	 */
	public void setNotificationCode(NotificationCode notificationCode) {
		this.notificationCode = notificationCode;
	}
	/**
	 * @return the distributionType
	 */
	public DistributionType getDistributionType() {
		return distributionType;
	}
	/**
	 * @param distributionType the distributionType to set
	 */
	public void setDistributionType(DistributionType distributionType) {
		this.distributionType = distributionType;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the code
	 */
	public char getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(char code) {
		this.code = code;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
