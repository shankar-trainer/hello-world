package edu.chitkara.collection;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private float empSalary;

	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.empSalary > o.empSalary)
			return 1;
		else if (this.empSalary < o.empSalary)
			return -1;
		else
			return 0;
	}

}
