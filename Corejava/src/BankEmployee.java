public class BankEmployee {
     int empId;
     String name;
     float salary;
     
     public BankEmployee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}


	void bankEmployeeInfo() {
    	 System.out.println("****  Employee Information *****");
         System.out.println("\tId "+empId);
         System.out.println("\tName "+name);
         System.out.println("\tSalary "+salary);
     }
}
