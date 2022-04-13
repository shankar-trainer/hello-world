
public class Employee {

	int id;
	String name;
	float salary;
	
	void employeeInfo() {
		System.out.println("Employee data");
		System.out.println("\tId is "+id);
		System.out.println("\tname is "+name);
		System.out.println("\tSalary is "+salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.id=9898998;
		emp1.name="sagar kumar";
		emp1.salary=89000;
		
		Employee emp2=new Employee();
		emp2.id=7899998;
		emp2.name="amit kumar";
		emp2.salary=75000;
		
		Employee emp3=new Employee();
		emp3.id=9898994;
		emp3.name="vijay kumar";
		emp3.salary=65000;
		
		emp1.employeeInfo();
		emp2.employeeInfo();
		emp3.employeeInfo();
		
		
		
		
	}
}
