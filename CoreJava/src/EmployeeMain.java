
public class EmployeeMain {

	public static void main(String[] args) {
		
		Address  address=new Address(1,"new delhi","5a",110092,"delhi");
		Employee employee=new Employee(1001, "jai kumar", 12000, address);
	  
		employee.employeeInfo();
	}
}
