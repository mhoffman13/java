package main.java.enumeration;

import java.util.EnumSet;

/**
 * @author meredith hoffman
 * This enum categorizes whether notifications
 * are sent to MARTA vehicles and or stations.
 */
public enum DistributionType {
	ALL_VEH_STA("AA"),
	ALL_VEH("AV"),
	ALL_STA("AS"),
	SEL_VEH_STA("SA"),
	SEL_VEH("SV"),
	SEL_STA("SS");
	
	private final String type;
	private static final EnumSet<DistributionType> distributionTypes = EnumSet.allOf(DistributionType.class);
	
	DistributionType(String type)
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
	public static DistributionType getDistributionType(String type){
		DistributionType distType = null;
		
		for(DistributionType elem : distributionTypes) {
			if(elem.toString().equalsIgnoreCase(type)) {
				distType = elem;
				break;
			}
		}		
		return distType;
	}
}