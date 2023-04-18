
public class PassengerMain {

	public static void main(String[] args) {
	
	Passenger passenger1=new Passenger();
	passenger1.setPassengerId(766776);
	passenger1.setPassengerName("suman kumar");
	passenger1.setPassengerAge(25);
	
	Passenger passenger2=new Passenger();
	passenger2.setPassengerId(766777);
	passenger2.setPassengerName("aman kumar");
	passenger2.setPassengerAge(29);
	
	//passenger2.setCountry("sri lanka");
	
	passenger1.passengerDetails();
	passenger2.passengerDetails();
	
	//=======================
	 System.out.println(Passenger.getCountry());
	 System.out.println(passenger1.getCountry());
	 System.out.println(passenger2.getCountry());
	 		
	 System.out.println("math pi"+Math.PI); 
	 System.out.println("math E"+Math.E); 
	 System.out.println("math  sin 90 "+Math.sin(Math.PI/2)); 
		
	}
}
