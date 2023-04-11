
public class Address {
	private int addressId;
	private String addressStreet;
	private String addressCity;
	private String addressState;
	private int addressPin;

	public Address(int addressId, String addressStreet, String addressCity, String addressState, int addressPin) {
		this.addressId = addressId;
		this.addressStreet = addressStreet;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressPin = addressPin;
	}

	public int getAddressId() {
		return addressId;
	}

	public String getAddressStreet() {
		return addressStreet;
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

}
