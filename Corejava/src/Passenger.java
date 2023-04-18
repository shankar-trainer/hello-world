
public class Passenger {

	private int passengerId;  // instance variable
	private String passengerName;
	private  int  passengerAge;
	private static String country="india";// class or static varible
	
	public static void main(String[] args) {
     Passenger passenger=new Passenger();
     passenger.passengerId=989898;
     passenger.passengerName="suresh kumar";
     passenger.passengerAge=40;
     
     System.out.println("passenger details ");
     System.out.println("\tid "+passenger.passengerId);
     System.out.println("\tname "+passenger.passengerName);
     System.out.println("\tage "+passenger.passengerAge);
	
     System.out.println("\tcountry  "+country);
	}
	
}
