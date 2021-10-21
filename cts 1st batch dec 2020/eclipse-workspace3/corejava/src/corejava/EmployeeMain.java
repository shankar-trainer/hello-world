package corejava;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		
		//employee.eid;
		employee.setEid(1001);
		employee.setEname("mohan kumar");
		employee.setSalary(34000);
		
		
		System.out.println("eid is "+employee.getEid());
		System.out.println("name is "+employee.getEname());
		System.out.println("salary is "+employee.getSalary());
		
		
		
	}
}
