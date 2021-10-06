package corejava;

class Vehicle{
	
}

public class Bike extends Vehicle{
	
	public static void main(String[] args) {
		Bike bike=new Bike();
		
		if(bike instanceof Bike)
			System.out.println("bike instanceof Bike");
		
		if(bike instanceof Vehicle)
			System.out.println("bike instanceof Vehicle");
		if(bike instanceof Object)
			System.out.println("bike instanceof Object");	
	}
}
