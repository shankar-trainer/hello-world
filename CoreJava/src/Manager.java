class Employee1 {
	private int id;
	private String name;
	private float salary;

	public Employee1(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void empInfo() {
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println("salary is " + salary);
	}
}

// Manager is a Employee
public class Manager extends Employee1 {
	private String location;
	private float pf;

	@Override
	void empInfo() {
		super.empInfo();
		System.out.println("location  is " + location);
		System.out.println("pf is " + pf);
	}
	
	public Manager(int id, String name, float salary, String location, float pf) {
		super(id, name, salary);
		this.location = location;
		this.pf = pf;
	}

	public String getLocation() {
		return location;
	}

	public float getPf() {
		return pf;
	}

	public static void main(String[] args) {
		Manager manager = new Manager(76767, "suman kumar", 56000, "madurai", 0.05f);
		System.out.println("manage information");
		manager.empInfo();
	}
}
