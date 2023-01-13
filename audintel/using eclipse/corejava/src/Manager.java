
public class Manager {
	private int managerId;
	private String managerName;
	private String managerLocation;
	private float managersalary;

	private Address address;
	private Phone phone[];

	public Manager(int managerId, String managerName, String managerLocation, float managersalary, Address address,
			Phone[] phone) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerLocation = managerLocation;
		this.managersalary = managersalary;
		this.address = address;
		this.phone = phone;
	}
	public int getManagerId() {
		return managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public String getManagerLocation() {
		return managerLocation;
	}
	public float getManagersalary() {
		return managersalary;
	}
	public Address getAddress() {
		return address;
	}
	public Phone[] getPhone() {
		return phone;
	}
	
	
	

}
