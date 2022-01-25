package parts;
import main.CarPart;

public class Wheels extends CarPart {
	//shocks & struts
	//steering
	//shafts and axles
	//tire pressure
	//treads
	//rotation
	
	public Wheels() {
		partName = "Wheels";
		this.durability = 100;
		this.condition = durability;
	}

	@Override
	public void doFunction() {
		super.doFunction();
		
	}

}
