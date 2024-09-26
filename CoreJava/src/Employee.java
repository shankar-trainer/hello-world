public class Employee {
	private int id;// instance variable //state or data
	private String name;// instance variable
	private float salary;// instance variable

	public Employee() {
		System.out.println("constructor called ");
		id = 1009;
		name = "ram kumar";
		salary = 90000;
	}

	public int getId() { // getter setter -- code
		return id;
	}

	public void setId(int id) {
		this.id = id; // code +data
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	void empInfo() {
		System.out.println("\nEmployee  data ");
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println("salary is " + salary);
	}
}
