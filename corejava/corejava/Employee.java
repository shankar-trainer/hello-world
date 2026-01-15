
public class Employee {

	int id;       // attribute , instance variable  have default value 0 or null
	String name;
	float salary;
	
	void work() {
		System.out.println("employee works ");
	}
	
	
	public static void main(String[] args) {
		Employee employee; // reference variable , not referring anything 
		
		employee=new Employee() ; // new Employee() creates object and returns the reference of the 
	                          	//object to the employee variable
		
		    // using object access attributes and methods(behavior) using . operator 
	
		employee.work();
		employee.id=10001;
		employee.name="sunil kumar";
		
		System.out.println("employee1 data\nid is "+employee.id);
		System.out.println("name is "+employee.name);
		
		Employee employee1=new Employee();
		
		employee1.id=10002;
		employee1.name="kamal kumar";
	
		System.out.println("\nemployee2 data\nid is "+employee1.id);
		System.out.println("name is "+employee1.name);
	
	}
	
}
