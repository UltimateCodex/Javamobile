package main;
public class Roadway{

	public static void main(String[] args) {
		Car car = new Car("myCar", "Tesla");
		car.getStatus();
		try {
			car.runCar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}