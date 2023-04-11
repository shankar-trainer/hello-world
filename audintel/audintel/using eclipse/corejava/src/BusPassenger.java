
public class BusPassenger extends Passenger {

	private String route;
	private int age;

	public BusPassenger(int passengerId, String passengerName, String passengerLocation, String passengerCountry,
			String route, int age) {
		super(passengerId, passengerName, passengerLocation, passengerCountry);
		this.route = route;
		this.age = age;
	}

	@Override
	// protected
	public void passengerDetail(String s) {
		super.passengerDetail("");

		System.out.println("\t route\t:" + route);
		System.out.println("\t age\t:" + age);
	}

	public static void main(String[] args) {

		BusPassenger busPassenger = new BusPassenger(78787878, "ramakant yadav", "gulbarga", "India",
				"gulbarga to bidar", 45);

		busPassenger.passengerDetail();

	}

}
