
public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		//employee1.id=-89989;
		
		employee1.setId(565656);
		employee1.setName("suraj kumar");
		employee1.setSalary(35000);
		
		System.out.println("id is "+employee1.getId());
		System.out.println("name is "+employee1.getName());
		System.out.println("salary is "+employee1.getSalary());
		
		//employee1.empInfo();
	}
}
