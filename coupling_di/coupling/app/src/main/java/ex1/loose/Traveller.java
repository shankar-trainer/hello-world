package ex1.loose;

interface Vehicle{
	void start();
}
class Car implements Vehicle{
	@Override
	public void start() {
	System.out.println("travel by car");	
	}
}

class Bike implements Vehicle{
	@Override
	public void start() {
	System.out.println("travel by bike");	
	}
	
}
public class Traveller {

	Vehicle vehicle;
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public static void main(String[] args) {
		System.out.println("loose coupling");
		Vehicle car=new Car();
	 
	 Traveller traveller=new Traveller();
	 
	 traveller.setVehicle(car);
	 traveller.vehicle.start();
	 
	 
	 Vehicle bike=new Bike();
	 
	 traveller.setVehicle(bike);
	 traveller.vehicle.start();
	 
	}
}
