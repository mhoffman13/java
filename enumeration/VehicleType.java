package main.java.enumeration;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 *
 */
public enum VehicleType {
	TRAIN("T"),
	BUS("B");
	
	private final String type;
	private static final EnumSet<VehicleType> vehicleTypes = EnumSet.allOf(VehicleType.class);
	
	VehicleType(String type)
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
	public static VehicleType getVehicleType(String type){
		VehicleType vehType = null;
		
		for(VehicleType elem : vehicleTypes) {
			if(elem.toString().equalsIgnoreCase(type)) {
				vehType = elem;
				break;
			}
		}		
		return vehType;
	}
}