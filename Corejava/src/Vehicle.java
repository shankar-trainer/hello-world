public class Vehicle {   // level1
	String model;
	public Vehicle(String model) {
		this.model = model;
	}
}
class Car extends Vehicle {  // level2
	float cost;
	public Car(String model, float cost) {
		super(model);
		this.cost = cost;
	}
}
//class can extend only one class at a time
//class SportsCar extends Car,Vehicle {  // error 
class SportsCar extends Car {  // level3   
	String location;

	public SportsCar(String model, float cost, String location) {
		super(model, cost);
		this.location = location;
	}
	public static void main(String[] args) {
          SportsCar car=new SportsCar("farari", 300000, "banglore");
          System.out.println("sports car values ");
          System.out.println("\tModel "+car.model);
          System.out.println("\tCost "+car.cost);
          System.out.println("\tLocation "+car.location);
	}
}
