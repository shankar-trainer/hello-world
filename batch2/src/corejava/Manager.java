package corejava;
class Manager extends Employee {
	private float managerSalary;
	private String managerLocation;

	public Manager(int employeeId, String employeeName, int employeeAge, float managerSalary, String managerLocation) {
		super(employeeId, employeeName, employeeAge);
		this.managerSalary = managerSalary;
		this.managerLocation = managerLocation;
	}

	public float getManagerSalary() {
		return managerSalary;
	}

	public String getManagerLocation() {
		return managerLocation;
	}

}
