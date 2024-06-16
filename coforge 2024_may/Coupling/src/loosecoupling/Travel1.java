package loosecoupling;

public class Travel1 {
	Vehicle vehicle;
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public static void main(String[] args) {

		Vehicle vehicle1=new Car();
		
		Travel1 travel1=new Travel1();
		
		travel1.setVehicle(vehicle1);
		travel1.vehicle.start();
		
		vehicle1=new Bike();
		
		travel1.setVehicle(vehicle1);
		travel1.vehicle.start();
		
		
		
	}
}
