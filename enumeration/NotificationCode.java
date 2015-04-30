package main.java.enumeration;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 * This enum categorizes the notifications sent
 * to MARTA vehicles and or stations according to
 * the notification's content.
 */
public enum NotificationCode {
	EMERGENCY("E","Emergency"),
	INFORMATION("I", "Information"),
	SERVICE("S", "Service"),
	ALERT("A", "Alert");
	
	private final String code;
	private final String description;
	private static final EnumSet<NotificationCode> notificationCodes = EnumSet.allOf(NotificationCode.class);
	
	NotificationCode(String code, String description)
	{
		this.code = code;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return this.code;
	}

	public String getDescription() {
		return description;
	}
	
	/**
	 * Returns the enum for this code.
	 */
	public static NotificationCode getNotificationCode(String code){
		NotificationCode notificationCode = null;
		
		for(NotificationCode elem : notificationCodes) {
			if(elem.toString().equalsIgnoreCase(code)) {
				notificationCode = elem;
				break;
			}
		}		
		return notificationCode;
	}
	
	public static NotificationCode getNotificationCodeByDescription(String code){
		NotificationCode notificationCode = null;
		
		for(NotificationCode elem : notificationCodes) {
			if(elem.getDescription().equalsIgnoreCase(code)) {
				notificationCode = elem;
				break;
			}
		}		
		return notificationCode;
	}
}