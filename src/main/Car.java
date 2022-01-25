package main;
import parts.Battery;
import parts.Brakes;
import parts.Cabin;
import parts.Engine;
import parts.Exhaust;
import parts.FuelTank;
import parts.Lights;
import parts.Radiator;
import parts.Transmission;
import parts.Wheels;

public class Car {
	//nameplate
	
	public String carName;
	public static String carModel;
	public int carMileage = 0;
	private CarPart[] carParts = new CarPart[9];
		
	public Car(String carName, String carModel) {
		this.carName = carName;
		Car.carModel = carModel;
		carParts[0] = new Engine(this);
		carParts[1] = new FuelTank(10);
		carParts[3] = new Battery(50);
		carParts[2] = new Radiator();	
		carParts[3] = new Exhaust();
		carParts[3] = new Transmission();
		carParts[3] = new Wheels();
		carParts[3] = new Brakes();
		carParts[3] = new Lights();
		carParts[3] = new Cabin();
	}
	
	public void getStatus() {
		System.out.println("\n\nChecking part status...");
		for (CarPart part: carParts) {
			part.getStatus();
		}
	}
	
	public void checkStatus() {
		for (CarPart part: carParts) {
			part.checkStatus();
		}
	}
	
	public void doFunction() {
		for (CarPart part: carParts) {
			part.doFunction();
		}
	}
	
	public void runCar() throws InterruptedException {
		System.out.println("\nStarting car...");
		while(true) {
			this.doFunction();
			this.checkStatus();
			if(carMileage % 10 == 0) {
				this.getStatus();
			}
			System.out.println("");
			Thread.sleep(200);
		}
	}

}
