
public class Employee {

	private int id;  // data/instance variable
	private String name;
	private float salary;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		// emp1 is employee reference variable
		// new Employee() -- create object, initialize each data member/instance
		// variable
		// with zero and null and then return the address/reference if the object

		System.out.println("Employee1 Data\n");
		System.out.println("id is " + emp1.id);
		System.out.println("name is " + emp1.name);
		System.out.println("salary is " + emp1.salary);

		Employee emp2 = new Employee();

		emp2.id = 9001;
		emp2.name = "suman kumar";
		emp2.salary = 20000;

		System.out.println("\nEmployee2 Data\n");
		System.out.println("id is " + emp2.id);
		System.out.println("name is " + emp2.name);
		System.out.println("salary is " + emp2.salary);
	}

}
