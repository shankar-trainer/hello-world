package cts.com.database;

public class EmployeeMain {

	public static void main(String[] args) {
		
	//	Employee emp1=new Employee();
		
		Employee emp1=Employee.getEmployeeInstance();
		
		emp1.setId(1001);
		emp1.setName("mohan kumar");
		
		
		System.out.println(emp1.getId()+"  "+emp1.getName());
		
		Employee emp2=Employee.getEmployeeInstance();
		
		System.out.println(emp2.getId()+"  "+emp2.getName());
			
	}
}
