
public class Kids {

	private int kidsRegNo;
	private  String kidsName;
	private int kidsAge;

	private Address address;

	public Kids(int kidsRegNo, String kidsName, int kidsAge, Address address) {
		super();
		this.kidsRegNo = kidsRegNo;
		this.kidsName = kidsName;
		this.kidsAge = kidsAge;
		this.address = address;
	}

	public void kidsInfo() {
		System.out.println("kids reg no " + kidsRegNo);
		System.out.println("kids  name   " + kidsName);
		System.out.println("kids age  " + kidsAge);
		System.out.println("Address  city " + address.getCity());
		System.out.println("Address state  " + address.getState());
		System.out.println("Address pin " + address.getPin());
	}

}
