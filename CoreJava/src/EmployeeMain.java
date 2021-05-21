
public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee(9000,"virendr kumar",67000);
		Employee employee3 = new Employee(7899,"ashok kumar",89000);

		Employee employee4=employee1;
		
		employee4.empId=1;
		employee4.empName="a";
		employee4.empSalary=10;
		
		
		employee1.empInfo();
		employee2.empInfo();
		employee3.empInfo();
	}
}
