package main;

import java.util.Scanner;

public abstract class CarPart implements Function{

	public String partName;
	protected double durability;
	protected double condition;
	
	public CarPart() {
	}
	
	public void getStatus() {
		System.out.printf("%12s %s %.1f%s\n", partName, "is in condition:", 100*condition/durability, "%");
	}
	
	public void checkStatus() {
		if(condition <= 5 && condition > 0) {
			System.out.print(partName + " is almost worn down! ");
		}
		else if(condition <= 0) {
			System.out.print(partName + " has worn out and needs to be replaced! ");
			replacePart();
		}
	}
	
	public void replacePart() {
		@SuppressWarnings("resource")
		Scanner query = new Scanner(System.in);  
	    System.out.println("Replace the " + partName + "?");
	    String answer = query.nextLine(); 
	    if(answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")) {
	    	this.condition = this.durability;
	    	System.out.println(partName + " has been replaced.");
	    }
	    else {
	    	System.out.println("Ok, have fun being stuck here...");
	    	replacePart();
	    }
	}
	
	public void doFunction() {
		this.condition -= 2*Math.random();
	}
}
