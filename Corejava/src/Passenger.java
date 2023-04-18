
public class Passenger {

	private int passengerId;  // instance variable
	private String passengerName;// instance variable
	private  int  passengerAge;// instance variable

	private static String country="india";// class or static varible

	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Passenger.country = country;
	}

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
