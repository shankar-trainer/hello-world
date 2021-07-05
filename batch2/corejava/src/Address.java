
public class Address {

	private int addrId;
	private String addrCity;
	private String addrState;
	private int  addrPin;
	
	public Address(int addrId, String addrCity, String addrState, int addrPin) {
		super();
		this.addrId = addrId;
		this.addrCity = addrCity;
		this.addrState = addrState;
		this.addrPin = addrPin;
	}

	public int getAddrId() {
		return addrId;
	}

	public String getAddrCity() {
		return addrCity;
	}

	public String getAddrState() {
		return addrState;
	}

	public int getAddrPin() {
		return addrPin;
	}
	
	
	
	
}
