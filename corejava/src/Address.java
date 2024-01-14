
public class Address {

	private int addrId;
	private String addrLocation;
	private  String addrCity;
	private int addrPin;
	
	public Address(int addrId, String addrLocation, String addrCity, int addrPin) {
		super();
		this.addrId = addrId;
		this.addrLocation = addrLocation;
		this.addrCity = addrCity;
		this.addrPin = addrPin;
	}
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getAddrLocation() {
		return addrLocation;
	}
	public void setAddrLocation(String addrLocation) {
		this.addrLocation = addrLocation;
	}
	public String getAddrCity() {
		return addrCity;
	}
	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}
	public int getAddrPin() {
		return addrPin;
	}
	public void setAddrPin(int addrPin) {
		this.addrPin = addrPin;
	}
	
	
}
