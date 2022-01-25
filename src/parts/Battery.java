package parts;

import main.CarPart;

public class Battery extends CarPart {
	//spark plugs
	//alternator
	//lights
	//horn
	//air conditioning

	private int maxCharge = 100;
	private static int curCharge;
	
	public Battery(int curCharge) {
		partName = "Battery";
		this.durability = 150;
		this.condition = durability;
		Battery.curCharge = curCharge;
	}

}
