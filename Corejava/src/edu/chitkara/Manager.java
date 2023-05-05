package edu.chitkara;

public class Manager extends Employee {
	private String location;
	private String state;

	public Manager(int empId, String empName, float empSalary, String location, String state) {
		super(empId, empName, empSalary);
		this.location = location;
		this.state = state;
	}
	@Override
	public void empInfo() {
		System.out.println("Manager values ");
		System.out.println("\tid  is " + getEmpId());
		System.out.println("\tname  is " + getEmpName());
		System.out.println("\tsalary  is " + getEmpSalary());
		System.out.println("\tlocation  is " + location);
		System.out.println("\tstate  is " + state);
	}
}
