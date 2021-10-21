
public class Employee {

	private int id;
	private String name;
	private float salary;
	private static  String jobType="IT Professional";
	

	public static String getJobType() {
		return jobType;
	}
	

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}
}
