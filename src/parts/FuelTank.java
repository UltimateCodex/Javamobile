package parts;
import java.util.Scanner;

import main.CarPart;

public class FuelTank extends CarPart{

	private int maxFuel = 100;
	private static int curFuel;
	
	public FuelTank(int curFuel) {
		partName = "Fuel Tank";
		this.durability = 200;
		this.condition = durability;
		FuelTank.curFuel = curFuel;
	}

	public static void useFuel() {
		if (curFuel > 0){curFuel -= 1;}
		else 			{refuelTank();}
	}
	
	public static void refuelTank() {
		@SuppressWarnings("resource")
		Scanner fuel = new Scanner(System.in);  
	    System.out.println("Fuel tank empty. What percentage to refill?");
	    int amount = 0;
	    
	    try {
		    amount = fuel.nextInt(); 
	    }
	    catch(Exception e){
			System.out.println("Please enter an integer. \n");
			refuelTank();
	    }
	    
	    if(amount > 100) {
	    	curFuel = 100;
	    	System.out.println("Fuel tank can't hold that much fuel. Topped up instead. \n");
	    }
	    else if(amount > 0) {
	    	curFuel = amount;
	    	System.out.println("Fuel tank refilled to " + amount + "%");
	    }
	    else {
	    	System.out.println("Can't go anywhere on an empty tank...\n");
	    	refuelTank();
	    }
	}
		
	@Override
	public void doFunction() {
		super.doFunction();
		System.out.printf("%s %s%s", "There is", 100*curFuel/maxFuel, "% fuel left. ");
	}

}
