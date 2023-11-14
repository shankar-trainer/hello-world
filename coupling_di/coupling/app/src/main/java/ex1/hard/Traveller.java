package ex1.hard;

class Car{
	void start() {
		System.out.println("start by car");
	}
}

class Bike{
	void start() {
		System.out.println("start by bike");
	}
}

public class Traveller {

	public static void main(String[] args) {
		System.out.println("hard coupling");
		Car car=new Car();
		Bike bike =new Bike();
		car.start();
		bike.start();
		
	}
}
// gradle run
// gradlew run