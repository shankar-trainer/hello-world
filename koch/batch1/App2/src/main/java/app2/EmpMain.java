package app2;

import com.cts.model.Employee;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(10001);
		employee.setName("amit kumar");
		employee.setSalary(12000);
		
		System.out.println("\tid : "+employee.getId());
		System.out.println("\tname : "+employee.getName());
		System.out.println("\tsalary : "+employee.getSalary());
	}
}
