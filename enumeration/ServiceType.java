package main.java.enumeration;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 *
 */
public enum ServiceType {
	TRIPS("T"),
	DAYS("D"),
	MONEY("M");
	
	private final String type;
	private static final EnumSet<ServiceType> types = EnumSet.allOf(ServiceType.class);
	
	ServiceType(String type)
	{
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}

	/**
	 * Returns the enum for this type.
	 */
	public static ServiceType getServicePurchaseType(String type){
		ServiceType serviceType = null;
		
		for(ServiceType elem : types) {
			if(elem.toString().equalsIgnoreCase(type)) {
				serviceType = elem;
				break;
			}
		}		
		return serviceType;
	}
}