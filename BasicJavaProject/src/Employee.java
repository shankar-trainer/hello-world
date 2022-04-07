
public class Employee {

	int id;
	String name;
	float salary;

	public Employee() {
		id = 1001;
		name = "harendra kumar";
		salary = 67000;
		System.out.println("default constructor");
	}

	public Employee(int id, String name, float salary) {
		System.out.println("overloaded constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void empInfo() {
		System.out.println("\nEmployee Information");
		System.out.println("\tid is " + id);
		System.out.println("\tname is " + name);
		System.out.println("\tsalary is " + salary);
	}

	public static void main(String[] args) {

		Employee emp1=new Employee();
		Employee emp2=new Employee(1002,"mahendra kumar",67000);
		Employee emp3=new Employee(1003,"lalan kumar",78000);
		Employee emp4=new Employee(1004,"vishwajeet partap",89000);
		
		emp1.empInfo();
		emp2.empInfo();
		emp3.empInfo();
		emp4.empInfo();
	}
}
