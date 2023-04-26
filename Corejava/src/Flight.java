public class Flight {
	int flightId;
	String flighName;
	
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flighName=" + flighName + "]";
	}

	public Flight(int flightId, String flighName) {
		this.flightId = flightId;
		this.flighName = flighName;
	}
	
	public static void main(String[] args) {
		Flight flight=new Flight(434343, "indigo");
		System.out.println(flight);

		//System.out.println(flight.toString());
		
		
//  Object class toString -->  getClass().getName() + '@' + Integer.toHexString(hashCode())
		 

	}
	
	
	
}
