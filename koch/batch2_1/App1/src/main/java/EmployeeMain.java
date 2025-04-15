import com.cts.model.Employee;

public class EmployeeMain {

	// main   ctrl +space
	
	public static void main(String[] args) {
		//sysout    ctrl +space 
		System.out.println("Employee Information ");
		
		Employee employee=new Employee();
		employee.setId(10001);
		employee.setName("rahul sharma");
		employee.setSalary(12000);
		
		System.out.println("\tid : "+employee.getId());
		System.out.println("\tname : "+employee.getName());
		System.out.println("\tsalary : "+employee.getSalary());
	}
}
