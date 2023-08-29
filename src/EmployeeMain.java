import java.util.Scanner;

public class EmployeeMain {
	static Scanner scanner = new Scanner(System.in);

	public static Employee getEmployeeDetails() {
		Employee employee = new Employee();
		System.out.println("Enter Id");
		employee.setEmployeeId(scanner.nextInt());

		System.out.println("Enter Name");
		employee.setEmployeeName(scanner.next());

		System.out.println("Enter salary");
		employee.setSalary(scanner.nextDouble());
		employee.calculateNetSalary(getPFPercentage());
		scanner.close();
		return employee;
	}

	public static int getPFPercentage() {

		System.out.println("Enter PF percentage");
		return scanner.nextInt();

	}

	public static void main(String[] args) {
	Employee emp1=	getEmployeeDetails();
		System.out.println("Id : "+emp1.getEmployeeId());
		System.out.println("Name : "+emp1.getEmployeeName());
		System.out.println("Salary : "+emp1.getSalary());
		System.out.println("Net Salary : "+emp1.getNetSalary());
	}
}
