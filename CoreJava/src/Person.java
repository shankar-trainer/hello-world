public class Person {
	private int id;
	private String name;
	private float salary;

	public Person(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void personInfo() {
		System.out.println("person information ");
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println("salary is " + salary);
	}
}

class Manager extends Person {

	private float pf;
	private String location;

	public Manager(int id, String name, float salary, float pf, String location) {
		super(id, name, salary);
		this.pf = pf;
		this.location = location;
	}
	
	@Override
	public void personInfo() {
		super.personInfo();
       System.out.println("pf is "+pf);	
       System.out.println("location is "+location);	
       System.out.println("gross salary is  "+(getSalary()-(getSalary()*pf)));	
	}

	public static void main(String[] args) {
		Manager manager = new Manager(1001, "kamal kuamr", 20000.0f, 0.05f, "noida");
		manager.personInfo();
	}

}