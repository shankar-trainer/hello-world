
public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		
		employee.setEmployeeId(5656567);
		employee.setEmployeeName("kiran kumar");
		employee.setEmployeeSalary(12000);
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeSalary());
	}
}
