package corejava;
public class Employee {

	private int employeeId;
	private String employeeName;
	private int employeeAge;

	public Employee(int employeeId, String employeeName, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}
}



