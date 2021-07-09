
public class Employee {

	private int empId;
	private String empName;
	private Address address;
	
	// employee has an address
	
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Address getAddress() {
		return address;
	}

	
}
