package coupling.tightcoupling;

public class Traveller {
	Car car;
	Bike bike;
	
	public static void main(String[] args) {
	
		Traveller traveller=new Traveller();
		traveller.car=new Car();
		traveller.car.start();
		
		traveller.bike=new Bike();
		traveller.bike.start();
		
		
	}
	
}
