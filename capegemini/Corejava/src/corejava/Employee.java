package corejava;

public class Employee {

	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	float SalaryCalculation() {
		return salary;
	}
}

class CollegeEmployee extends Employee {
	private float pf;
	private String location;

	@Override
	float SalaryCalculation() {
		return getSalary() - getSalary() * pf / 100;
	}

	public CollegeEmployee(int id, String name, float salary, float pf,
			String location) {
		super(id, name, salary);
		this.pf = pf;
		this.location = location;
	}

	void CollegeEmployeeInfo() {
		System.out.println("College Employee Information");
		System.out.println("\tid is " + getId());
		System.out.println("\tName is " + getName());
		System.out.println("\tSalary is " + getSalary());
		System.out.println("\tNet Salary is " + SalaryCalculation());
		System.out.println("\tPF  is " + pf);
		System.out.println("\tLocation is " + location);
	}
	
	public static void main(String[] args) {
		CollegeEmployee employee=new CollegeEmployee
				(1001, "a kumar", 45000, 4, "Noida");
		employee.CollegeEmployeeInfo();
	}

}