package coupling.loosecoupling;

public class Traveller2 {
	Vehicle vehicle;
    // setter, getter DI(dependency injection)
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public static void main(String[] args) {
	
	 Vehicle vehicle=new Car();
	 Traveller2 traveller=new Traveller2();
	 traveller.setVehicle(vehicle);
	 traveller.vehicle.start();
	 
	 vehicle=new Bike();
	 traveller.setVehicle(vehicle);
	 traveller.vehicle.start();
	 
		
		
	}


	
}
