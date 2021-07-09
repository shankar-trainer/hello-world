package cts.collection.dao;

public class Employee {
	private int empId;
	private String empName;
	private float empsalary;

	public Employee(int empId, String empName, float empsalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpsalary() {
		return empsalary;
	}

}
