
public class Employee {

	int id;   // instance variable  it has default value as 0 and null
	String name;
	float salary ;
	float pf ;
	
	void employeeInfo() {// instance method
		System.out.println("\tid is "+id);
		System.out.println("\tname is "+name);
		System.out.println("\tsalary is "+salary);
		System.out.println("\tpf is "+pf);
		System.out.println("\tgross salary  is "+(salary-(salary*pf/100)));
	}
	
	public static void main(String[] args) {
		
		Employee employee1=new Employee();// object or instance of the class
		Employee employee2=new Employee();
		    // each object/instance has one copy of attributes(instance variable) and methods
	
	    employee1.id=98798;
	    employee1.name="mahesh kumar";
	    employee1.salary=20000;
	    employee1.pf=5;
	    
		System.out.println("Employee1 Information  ");
		
		employee1.employeeInfo();
		
		employee2.id=98799;
		employee2.name="suhesh kumar";
		employee2.salary=50000;
		employee2.pf=7;
	    
		System.out.println("Employee2 Information  ");
		
		employee2.employeeInfo();
		
		
	}
	
}
