
public class Employee {

	int empId;    // instance variable 
	String empName;
	float empSalary;

	public Employee() {
		empId = 87778;
		empName = "harendra kumar";
		empSalary = 787887;
		System.out.println("constructor called");
	}

	public Employee(int empId, String empName, float empSalary) {
		System.out.println("overloaded constructor called");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	void empInfo() {  // instance method 
		System.out.println("\nEmployee Information ");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
	}
}
