package org.cts.error;

public class Employee {

	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) throws EmployeeException {
		if(employeeId<=0)
			throw new EmployeeException("invalid id");
		else if(employeeId<10000 | employeeId>20000)
			throw new EmployeeException(" id not in range 10000 - 20000");
			
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) throws EmployeeException {
		if(employeeName.isEmpty())
			throw new EmployeeException("name is empty");
		else if(employeeName.length()<=6 || employeeName.length()>20)
			throw new EmployeeException("name length must be of 6 to 20 chars ");
		else
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) throws EmployeeException {
		if(employeeSalary<=0)
			throw new EmployeeException("invalid employee salary");
		else if(employeeSalary<10000 || employeeSalary>100000)
			throw new EmployeeException("salary not in range 10000 - 100000");
		else
		this.employeeSalary = employeeSalary;
	}
	
}
