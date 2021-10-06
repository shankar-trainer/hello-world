
public class Employee {

	int id;  // instance variable
	String name; // instance variable
	float salary; // instance variable
	static String company_name="global logic";// static or class variable 
	static String country;

	public Employee() {
		name="ram kumar";
		id=1001;
		salary=56000.78f;
	System.out.println("constructor called");
	}
	
	static{
		country="india";		
		System.out.println("static block called");
	}
	 
	public static void main(String[] args) {
		Employee employee=new Employee();
		Employee employee1=new Employee();
		
		System.out.println("Id is "+employee.id);
		System.out.println("Name is "+employee.name);
		System.out.println("Salary is "+employee.salary);
		
		System.out.println("company_name "+company_name);
		System.out.println("country "+country);
		
	}
}
