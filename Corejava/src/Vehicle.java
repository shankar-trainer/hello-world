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
	public SportsCar(String model, float cost, String location) {
		super(model, cost);
		this.location = location;
	}

	String location;

	public static void main(String[] args) {

	}
}
