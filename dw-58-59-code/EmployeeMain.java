
public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		
		employee1.setEmpId(10001);
		employee1.setEmpName("amrendra kumar");
		employee1.setSalary(24000);
		
		Employee employee2=new Employee();
		employee2.setEmpId(10002);
		employee2.setEmpName("virendra kumar");
		employee2.setSalary(29000);
		
		employee1.empInfo();
		employee2.empInfo();
		
		Employee emp[]=new Employee[2];
		emp[0]=employee1;
		emp[1]=employee2;

		float totalSalary=employee1.totSalary(emp);
		System.out.println("total salary is "+totalSalary);
		System.out.println("average salary is "+employee1.avgSalary(emp));
		
		
	}
}
