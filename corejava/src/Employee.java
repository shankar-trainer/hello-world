
public class Employee {

	 int id;    // instance variable
	 String name;
	 float salary;
     float pf;
	 
     // instance method
	 void employeeInfo() {    
		 System.out.println("\n ======= Employee Information =======");
		 System.out.println("\tId :"+id);
		 System.out.println("\tName :"+name);
		 System.out.println("\tSalary :"+salary);
		 System.out.println("\tPf is  :"+pf);
		 System.out.println("\tGross salary  is  :"+grossSalary());
	 }
	 
	 float grossSalary() {
		 return salary-(salary*pf/100);
	 }
	 
	 float totalSalary(float sal1,float sal2,float sal3) {
		 return  sal1+sal2+sal3;
	 }
	 float avgSalary(float sal1,float sal2,float sal3) {
		 return  (sal1+sal2+sal3)/3;
	 }
	  
	 
	 public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		
		employee1.id=10001;
		employee1.name="suresh kumar";
		employee1.salary=34000;
		employee1.pf=4;
		
		employee2.id=10002;
		employee2.name="anand kumar";
		employee2.salary=39000;
		employee2.pf=4.5f;
		
		employee3.id=10003;
		employee3.name="suryansh kumar";
		employee3.salary=54000;
		employee3.pf=7.3f;
		
		
		employee1.employeeInfo();
		employee2.employeeInfo();
		employee3.employeeInfo();
	
		System.out.println("\n Total salary "+employee1.totalSalary
				(employee1.salary, employee2.salary, employee3.salary));
		 
		
		System.out.println("\n Average salary "+employee1.avgSalary
				(employee1.salary, employee2.salary, employee3.salary));
		
		
	}
	 
}
