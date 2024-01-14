public class Teacher {

	private int id;
	private String name;
	private float salary;

	public Teacher(int id, String name, float salary) {
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

	 void teacherInfo() {
		System.out.println("Teacher data ");
		System.out.println("\tid  " + getId());
		System.out.println("\tname  " + getName());
		System.out.println("\tsalary  " + getSalary());
	}

}
