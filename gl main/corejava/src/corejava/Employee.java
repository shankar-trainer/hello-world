package corejava;

public class Employee {

	int id;
	String name;
	float salary;
	
	float netSalary() {

		return salary - (salary * 0.05f);
	}

	void empInfo() {
		System.out.println("\nEmployee Information");
		System.out.println("\tid is " + id);
		System.out.println("\tname is " + name);
		System.out.println("\tsalary is " + salary);
		System.out.println("\tnet salary is " + netSalary());
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.id = 1001;
		emp1.name = "ram kumar";
		emp1.salary = 12000;

		emp2.id = 1002;
		emp2.name = "suresh kumar";
		emp2.salary = 78000;

		emp1.empInfo();
		emp2.empInfo();

	}
}
