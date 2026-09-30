package loosecouple;

public class Traveller2 {

	Vehicle vehicle;

	public Traveller2(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public static void main(String[] args) {

		Vehicle vehicle1 = new Car();

		Traveller2 traveller2 = new Traveller2(vehicle1);
		traveller2.getVehicle().start();
		
		vehicle1 = new Bike();
		traveller2 = new Traveller2(vehicle1);
		traveller2.getVehicle().start();

	}
}
