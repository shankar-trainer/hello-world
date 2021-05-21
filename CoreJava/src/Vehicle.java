
public class Vehicle {
	String name;
}

class Bike{
}
class Car extends Vehicle {
	String wheelerType;
}

class SportsCar extends Car {
	public static void main(String[] args) {
		SportsCar car1 = new SportsCar();
		Car car2 = new SportsCar();
		Vehicle car3 = new SportsCar();

//		if(car1 instanceof Bike) {
//			System.out.println("car1 instanceof SportsCar");
//		}
		if(car1 instanceof SportsCar) {
			System.out.println("car1 instanceof SportsCar");
		}
		
		if(car1 instanceof Car) {
			System.out.println("car1 instanceof Car");
		}
		if(car1 instanceof Vehicle) {
			System.out.println("car1 instanceof Vehicle");
		}
		
		if(car1 instanceof Object) {
			System.out.println("car1 instanceof Object");
		}
		
		
		
	}
}