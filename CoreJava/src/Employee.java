
public class Employee {

	private int employeeId;// camel case
	private String employeeName;
	private float employeeSalary;

	private Address address;// composition , has a relationship

	public Employee(int employeeId, String employeeName, float employeeSalary, Address address) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.address = address;
	}

	public void employeeInfo() {
       System.out.println("Employee Information ");
       System.out.println("Id "+employeeId);
       System.out.println("Name "+employeeName);
       System.out.println("Salary "+employeeSalary);

       System.out.println("\nEmployee Address ");
       address.addressInfo();
     
	}

}
