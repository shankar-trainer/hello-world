
public class Passenger {

	private int passengerId;
	private String  passengerName;
	private String  passengerLocation;
	private String  passengerCountry;

	public Passenger(int passengerId, String passengerName, String passengerLocation, String passengerCountry) {
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerLocation = passengerLocation;
		this.passengerCountry = passengerCountry;
	}
	
	
	protected void passengerDetail(String s) {
		System.out.println("\nPassenger Details \n");
		System.out.println("\t id\t:"+passengerId);
		System.out.println("\t name\t:"+passengerName);
		System.out.println("\t location\t:"+passengerLocation);
		System.out.println("\t country\t:"+passengerCountry);
	} 
}
