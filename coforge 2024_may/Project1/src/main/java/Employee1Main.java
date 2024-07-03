
public class Employee1Main {

	static java.util.Scanner sc=new java.util.Scanner(System.in);
	
	public static Employee1 getEmployeeDetails() {
		Employee1 employee1=new Employee1();
		
		System.out.println("Enter Id:");
		employee1.setEmployeeId(sc.nextInt());
		
		System.out.println("Enter Name:");
		employee1.setEmployeeName(sc.next());
		
		System.out.println("Enter Salary:");
		employee1.setSalary(sc.nextDouble());
		
		return employee1;
		
	}
	public static int getPFPercentage() {
		
		System.out.println("Enter PF percentage:");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
	
		Employee1 employee1=getEmployeeDetails();
		employee1.calculateNetSalary(getPFPercentage());
		
		System.out.println("Id :"+employee1.getEmployeeId());
		System.out.println("Name :"+employee1.getEmployeeName());
		System.out.println("Salary :"+employee1.getSalary());
		System.out.println("Net Salary :"+employee1.getNetSalary());
		
	}
}
