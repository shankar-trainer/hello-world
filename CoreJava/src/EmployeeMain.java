
public class EmployeeMain {

	public static void main(String[] args) {
		
		int id[]= {1001,102,1003,1004};
		
		String nm[]= {"umesh kumar","suresh kumar","shardha sharma","tripti suman"};
		String loc[]= {"delhi","mumbai","kolkotta","chennai"};
		float sal[]= {12000,19000,56000,20000};
		
		Employee employee[]=new Employee[4];
		
		for (int i = 0; i < employee.length; i++) {
		  employee[i]=new Employee(id[i], nm[i], sal[i], loc[i]);	
		}
		
		for (Employee employee2 : employee) {
		   System.out.println(employee2.getId()+" "+employee2.getName()+"  "+employee2.getSalary()+" "+employee2.getLocation());	
		}
	}
}
