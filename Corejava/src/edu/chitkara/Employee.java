package edu.chitkara;

public  abstract class Employee {
	private int empId;
	private  String empName;
	private float  empSalary;
	
	public abstract  void empInfo() ;

	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}
	
	
}
