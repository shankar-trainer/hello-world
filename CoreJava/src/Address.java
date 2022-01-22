
public class Address {

	private int addrId;
	private  String addrCity;
	private String addrSector ;
	private int addrPin;
	private String  addrState;
	
	public Address(int addrId, String addrCity, String addrSector, int addrPin, String addrState) {
		this.addrId = addrId;
		this.addrCity = addrCity;
		this.addrSector = addrSector;
		this.addrPin = addrPin;
		this.addrState = addrState;
	}
	
	public void addressInfo() {
		System.out.println("\taddress id "+addrId);
		System.out.println("\taddress city "+addrCity);
		System.out.println("\taddress sector "+addrSector);
		System.out.println("\taddress pin "+addrPin);
		System.out.println("\taddress state "+addrState);
	}
	
	
}
