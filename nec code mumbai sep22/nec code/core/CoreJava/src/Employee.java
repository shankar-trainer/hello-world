
public class Employee {

	 private int id;
	 private String name;
	 private float salary;
	 private Address address;
	
	 public Employee(int id, String name, float salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public Address getAddress() {
		return address;
	}
	 
	 
}
