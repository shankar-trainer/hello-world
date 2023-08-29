
public class Employee {

	int employeeId; // instance variable
	String employeeName; // instance variable
	float employeeSalary;// instance variable

	static String country; // static or class variable

	static {
		country = "india";
		System.out.println("static block called 1 ");
	}
	static {
		country = "bharat";
		System.out.println("static block called 2");
	}

	public Employee() {
		this.employeeId = 1001;
		this.employeeName = "sahrukh";
		this.employeeSalary = 90000.00f;
		System.out.println("constructor called ");
	}

	public void employeeInfo() // instance or non static method
	{ // access to both instance and static allowed
		System.out.println("employee data ");
		System.out.println("\tId :" + employeeId);
		System.out.println("\tName :" + employeeName);
		System.out.println("\tSalary :" + employeeSalary);
		System.out.println("\tCountry :" + country);
	}

	public static void employeeInfo1(Employee employee) 
	               // static/class method
	{ // access to only static allowed
		// for instance member object is required
		System.out.println("employee data ");
		System.out.println("\tId :" + employee.employeeId);
		System.out.println("\tName :" + employee.employeeName);
		System.out.println("\tSalary :" + employee.employeeSalary);
		System.out.println("\tCountry :" + country);
	}

	public static void main(String[] args) {
		System.out.println("Country is " + country);
	}
}
