
public class DomesticFlight extends Flight {

	private String type;
	private float ticketCost;

	public DomesticFlight(long flightId, String flightName, String flightSource, String flightDestination, String type,
			float ticketCost) {
		super(flightId, flightName, flightSource, flightDestination);
		this.type = type;
		this.ticketCost = ticketCost;
	}

	void domesticFlightInfo() {
		 super.getFlightInfo();
		System.out.println("\n\t type  :" + type);
		System.out.println("\t ticket cost  :" + ticketCost);
	}

	public static void main(String[] args) {
         DomesticFlight domesticFlight=new DomesticFlight(554545,"jet air ways","banglore","hyderabad","domestic",5000);
         
         domesticFlight.domesticFlightInfo();
	}
}
