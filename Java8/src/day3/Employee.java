
public class Employee {

	private int empId;
	private String empName;
	private float empsalary;
	// one to one  has a relationship 
	private Address address;
	
	// one to many   has a relationship 
	private Car cars[];
		
	public Car[] getCars() {
		return cars;
	}
	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
