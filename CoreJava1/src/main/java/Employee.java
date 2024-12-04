
public class Employee {

	private int employeeId;
	private String employeeName;
	private float employeeSalary; // 3 instance variable, each object get one copy

	private static String companyName = "coforge";
	// class variable , single copy is shared among all objects

	static int count=0;
	int c=0;
	public Employee(int employeeId, String employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		count++;
		c++;
	}

	public static void main(String[] args) {

		Employee employee=new Employee(1001, "pawan kumar", 45000);
		Employee employee1=new Employee(1001, "pawan kumar", 45000);
		Employee employee2=new Employee(1001, "pawan kumar", 45000);
		
		System.out.println("company name is " + companyName);
		System.out.println("id : " + employee.employeeId);
		System.out.println("name is " + employee.employeeName);
		System.out.println("salary is " + employee.employeeSalary);

		System.out.println("total no of objects are "+count);
		
		System.out.println("count :"+employee.c);
		System.out.println("count :"+employee1.c);
		System.out.println("count :"+employee2.c);
	}

}
