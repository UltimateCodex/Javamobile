package parts;
import main.CarPart;

public class Engine extends CarPart{
	//oil level
	//air, fuel, and oil filters
	//carburetor
	//speed
	//crankshaft
	
	private int cylinders = 4;
	main.Car car;
	
	public Engine(main.Car car) {
		this.partName = "Engine";
		this.durability = 300;
		this.condition = durability;
		this.car = car;
	}
	
	private void driveCar() {
		car.carMileage += 1;
	}
	
	@Override
	public void doFunction() {
		super.doFunction();
		FuelTank.useFuel();
		Radiator.makeHeat();
		Exhaust.makeExhaust();
		this.driveCar();
		System.out.print("The car has driven " + car.carMileage + " miles; ");
	}

}
