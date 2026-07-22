package coupling.loosecoupling;

public class Traveller {
	Vehicle vehicle;
    // constructor DI(dependency injection)
	public Traveller(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public static void main(String[] args) {
	
	 Vehicle vehicle=new Car();
	 Traveller traveller=new Traveller(vehicle);
	 traveller.vehicle.start();
	 
	 vehicle=new Bike();
	 traveller=new Traveller(vehicle);
	 traveller.vehicle.start();
	 
		
		
	}
	
}
