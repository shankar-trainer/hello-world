public class Bike {
}
class MotorBike extends Bike{
	
}

class SportsBike extends MotorBike{
	
	public static void main(String[] args) {
		
		SportsBike bike=new SportsBike();
		System.out.println(bike instanceof SportsBike);
		System.out.println(bike instanceof Bike);
		System.out.println(bike instanceof MotorBike);
		System.out.println(bike instanceof Object);
		//System.out.println(bike instanceof Employee);
		
	}
}


