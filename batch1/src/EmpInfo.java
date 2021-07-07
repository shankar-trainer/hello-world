import java.util.Scanner;

public class EmpInfo {

	public static void main(String[] args) {
		int empId;
		String empName;
		float salary;
		float pf;
		float gross_salary;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter employee id ");
		empId=scanner.nextInt();
		
		System.out.println("Enter employee name ");
		//scanner.nextLine();// read enter key 
		//empName=scanner.nextLine();
		empName=scanner.next();
		
		System.out.println("Enter employee salary ");
		salary=scanner.nextFloat();
		
		System.out.println("Enter employee pf % ");
		pf=scanner.nextFloat();
		
		gross_salary=salary-salary*pf/100;
		
		System.out.println("Employee Information ");
		System.out.println("Id is "+empId);
		System.out.println("Name is "+empName);
		System.out.println("Salary  is "+salary);
		System.out.println("Pf %   is "+pf);
		System.out.println("Gross Salary    is "+gross_salary);
	}
}
