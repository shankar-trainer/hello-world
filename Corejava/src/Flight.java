
public class Flight {

	int flightId;
	String flighName;
	
	@Override
	public String toString() {
		return "Flight Information\n"+
	     "\tId is "+flightId+
	     "\n\tName  is "+flighName;
	}
	
	public Flight(int flightId, String flighName) {
		this.flightId = flightId;
		this.flighName = flighName;
	}
	
	public static void main(String[] args) {
		Flight flight=new Flight(434343, "indigo");
		//System.out.println(flight.toString());
		System.out.println(flight);
//  Object class toString -->  getClass().getName() + '@' + Integer.toHexString(hashCode())
		 

	}
	
	
	
}
