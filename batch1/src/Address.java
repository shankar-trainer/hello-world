
public class Address {

	private String city;
	private String state;
	private int pin;
	
	public Address(String city, String state, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getPin() {
		return pin;
	}
	
	
	
}
