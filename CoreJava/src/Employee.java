
public class Employee {

	private int id;
	private String name;
	private  float salary;
	private  String location;
	
	public Employee(int id, String name, float salary, String location) {
		this.id = id;  // this is current class ref variable 
		this.name = name;
		this.salary = salary;
		this.location = location;
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

	public String getLocation() {
		return location;
	}
	
	
}
