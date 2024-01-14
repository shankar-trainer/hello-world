public class Worker {

	private int id;
	private  String name;
	private  float wages;
	
	private  Address address;
	//  Worker has a Address
	// composition -- has a relationship

	public Worker(int id, String name, float wages, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.wages = wages;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWages() {
		return wages;
	}

	public void setWages(float wages) {
		this.wages = wages;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	
}
