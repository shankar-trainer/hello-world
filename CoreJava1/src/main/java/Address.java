
public class Address {

	private int addrId;
	private  String addrCity;
	private  String addrState;
	
	public Address(int addrId, String addrCity, String addrState) {
		super();
		this.addrId = addrId;
		this.addrCity = addrCity;
		this.addrState = addrState;
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
	
	
	
}
