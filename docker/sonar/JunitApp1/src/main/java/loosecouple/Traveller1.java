package loosecouple;

public class Traveller1 {

	Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public static void main(String[] args) {
		Vehicle vehicle1=new Car();
		
		Traveller1 traveller1=new Traveller1();
		traveller1.setVehicle(vehicle1);
		traveller1.getVehicle().start();
		
		
		vehicle1=new Bike();
		traveller1.setVehicle(vehicle1);
		traveller1.getVehicle().start();

	}
}
