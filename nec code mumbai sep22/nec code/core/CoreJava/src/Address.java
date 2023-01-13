
public class Address {

	private int addressId;
	private String addressCity;
	private String addressState;
	private int addressPin;
	
	private Phone phone;

	public Address(int addressId, String addressCity, String addressState, int addressPin, Phone phone) {
		super();
		this.addressId = addressId;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressPin = addressPin;
		this.phone = phone;
	}

	public int getAddressId() {
		return addressId;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public int getAddressPin() {
		return addressPin;
	}

	public Phone getPhone() {
		return phone;
	}
	
	
	
	
	

}
