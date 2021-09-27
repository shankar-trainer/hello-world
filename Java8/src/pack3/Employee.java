package pack3;

public abstract class Employee {

	private int id;
	private String name;
	private float salary;

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public float getSalary() {
		return salary;
	}
	
	@Override                      // concrete method
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public abstract  float getNetSalary();
	
	
}

class Manager extends Employee {

	private String location;
	private String state;

	
	@Override
	public String toString() {
		
		return  super.toString()+"\nManager [location=" + location + ", state=" + state + "\nGross Salary"+getNetSalary()+"]";
	}

	public Manager(int id, String name, float salary, String location, String state) {
		super(id, name, salary);
		this.location = location;
		this.state = state;
	}

	public static void main(String[] args) {
		Manager manager1 = new Manager(788787, "abdhesh sharma", 67000, "madurai", "tamil nadu");
		Employee manager2 = new Manager(788788, "suresh sharma", 17000, "coimbtore", "tamil nadu");
		
		System.out.println(manager1);
		System.out.println(manager2);
		//Employee emp1=new Employee();
	}

	@Override
	public float getNetSalary() {
		return getSalary()-getSalary()*0.05f;
	}

}
