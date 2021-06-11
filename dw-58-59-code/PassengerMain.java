
public class PassengerMain {

	public static void main(String[] args) {

		Passenger passenger = new Passenger(1001, "suresh kumar", 34);
		System.out.println(passenger.getPassId());
		System.out.println(passenger.getPassName());
		System.out.println(passenger.getPassAge());
		System.out.println(Passenger.getCountry());
	}
}
