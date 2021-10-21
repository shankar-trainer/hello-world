import java.util.Scanner;

public class Employee {

	private int id;
	private String name;
	private float salary;

	Scanner scanner = new Scanner(System.in);

	void employeeInput() {
		System.out.println("\nEnter id name and salary");
		id = scanner.nextInt();
		scanner.nextLine();
		name = scanner.nextLine();
		salary = scanner.nextFloat();
	}

	void salaryInfo(float sal1, float sal2, float sal3) {
		float total_salary = sal1 + sal2 + sal3;
		float avg_salary = total_salary / 3;
		System.out.println("total salary is " + total_salary);
		System.out.println("average salary is " + avg_salary);
	}

	void empInfo(Employee e1, Employee e2, Employee e3) {
		Employee employee = null;
		if (e1.salary > e2.salary && e1.salary > e3.salary)
			employee = e1;
		if (e2.salary > e1.salary && e2.salary > e3.salary)
			employee = e2;
		if (e3.salary > e2.salary && e3.salary > e1.salary)
			employee = e3;
		System.out.println("Employee having highest salary ");
		System.out.println(employee.id + "  " + employee.name);
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		employee1.employeeInput();
		employee2.employeeInput();
		employee3.employeeInput();

		employee1.salaryInfo(employee1.salary, employee2.salary,
				employee3.salary);
		employee1.empInfo(employee1, employee2, employee3);
	}
}
