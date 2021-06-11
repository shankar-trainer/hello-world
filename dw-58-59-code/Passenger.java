public class Passenger {
	private int passId;
	private String passName;
	private int passAge;
	private static String country;
	
	public Passenger(int passId, String passName, int passAge) {
		this.passId = passId;
		this.passName = passName;
		this.passAge = passAge;
	}
	
	static {
		country="India";
		System.out.println("static code");
	}

	int getPassId() {
		return passId;
	}

	String getPassName() {
		return passName;
	}

	int getPassAge() {
		return passAge;
	}

	static String getCountry() {
		return country;
	}

	public Passenger() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		Passenger passenger = new Passenger(1001,"suresh kumar",34);
		System.out.println(passenger.getPassId());
		System.out.println(passenger.getPassName());
		System.out.println(passenger.getPassAge());
		System.out.println(getCountry());
	}
}
