
public class Employee {

	
	private int employeeId;
	private String employeeName;
	private float employeeSalary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	public static void main(String[] args) {
		Employee employee1=new Employee();
		
		employee1.employeeId=9889889;
		employee1.employeeName="ramesh kumar";
		employee1.employeeSalary=90000;
		
		System.out.println(employee1.employeeId);
		System.out.println(employee1.employeeName);
		System.out.println(employee1.employeeSalary);
		
		
	}

}
