public class Teacher {

	private int id;
	private  String name;
	private float salary;
	
	public void setId(int id) {
		this.id = id;
	}
		public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	
	
	float grossSalary() {
		return salary;
	}
	
	public void teacherInfo() {
		System.out.println("Teacher Information ");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		//System.out.println("gross salary is "+grossSalary());
	}
}
