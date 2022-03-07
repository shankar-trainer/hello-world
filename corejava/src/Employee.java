public class Employee {

	 int id;// properties or instance variable 
	 String name;
	 float salary;
	 
	 void work() {// instance method 
		 System.out.println("working in office ");
	 }
	 
	 public static void main(String[] args) {
		Employee emp1=new Employee(); //one copy of id,name, salary, work
	    System.out.println(emp1.id);
	    System.out.println(emp1.name);
	    System.out.println(emp1.salary);
	    emp1.work();
	    
	    Employee emp2=new Employee(); //one copy of id,name, salary, work
	    emp2.id=10001;              // default value of instance variables are 0 and null 
	    emp2.name="suresh kumar";
	    emp2.salary=19000;
	  
	    System.out.println(emp2.id);
	    System.out.println(emp2.name);
	    System.out.println(emp2.salary);
	    emp2.work();
	    
	    
	 }
}
