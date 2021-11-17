import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		emp1.setEmployeeId(sc.nextInt());
		
		
		System.out.println("Enter Name");
		sc.nextLine();
		emp1.setEmployeeName(sc.nextLine());
		
		System.out.println("Enter Salary");
		emp1.setEmployeeSalary(sc.nextFloat());
		
		System.out.println("Enter Location");
		emp1.setEmployeeLocation(sc.next());
		
		System.out.println("Employee 1 Record\n");
		
		System.out.println("\tEmployee Id "+emp1.getEmployeeId());
		System.out.println("\tEmployee Name "+emp1.getEmployeeName());
		System.out.println("\tEmployee Salary "+emp1.getEmployeeSalary());
		System.out.println("\tEmployee Location "+emp1.getEmployeeLocation());
		
		sc.close();
		
		
	}
}
