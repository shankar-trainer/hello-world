public class Flight {
	private long flightId;
	private String flightName;
	private String flightSource;
	private String flightDestination;

	public Flight(long flightId, String flightName, String flightSource, String flightDestination) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
	}

	public void getFlightInfo() {
		System.out.println("Flight Information");
		System.out.println("\tId :" + flightId);
		System.out.println("\tName :" + flightName);
		System.out.println("\tSource :" + flightSource);
		System.out.println("\tDestination :" + flightDestination);
	}
}
