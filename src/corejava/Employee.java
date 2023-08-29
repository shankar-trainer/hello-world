package corejava;

public class Employee {
	int id; // instance variable
	String name;
	float salary;

	public Employee() {
		System.out.println("constructor called ");
	}

	public static void main(String[] args) {
		Employee employee; // employee is reference variable
		
		employee = new Employee();// new Employee()
		employee.id = 10001;
		employee.name = "suresh kumar";
		employee.salary = 12000;
		

		System.out.println("id is " + employee.id);
		System.out.println("name is " + employee.name);
		System.out.println("salary is " + employee.salary);
	}
}
