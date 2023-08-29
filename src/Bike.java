public class Bike {
}

class SportsBike extends Bike {
}

class BikeMain {
	public static void main(String[] args) {
		Bike bike = new SportsBike();
		if (bike instanceof Bike)
			System.out.println("bike is instance of Bike ");

		System.out.println(bike instanceof SportsBike);
		System.out.println(bike instanceof Object);

	}
}