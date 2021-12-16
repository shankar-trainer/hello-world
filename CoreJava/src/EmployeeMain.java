
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();
       // emp1.id=9898;
		emp1.setId(8778);
		emp1.setName("surendra kumar");
		emp1.setSalary(34000);
		
		System.out.println("employee data ");
		System.out.println("id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());
		
		
		Employee emp2=emp1;
		
		
		System.out.println("emp1 id is "+emp1.getId());
		System.out.println("emp2 id is "+emp2.getId());
		
		emp2.setId(70000);
		
		System.out.println("emp1 id is "+emp1.getId());
		System.out.println("emp2 id is "+emp2.getId());
		
		
		
		
	}
}
