// super, parent, base 
public class Person {

	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}

// child, subclass, inherited, derived class 
class Manager extends Person {
	private String location;
	private float pf;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setId(98989898);
		manager.setName("suresh kumar");
		manager.setSalary(45000);
		
		manager.setLocation("madurai");
		manager.setPf(4.55f);
		
		System.out.println("id is " + manager.getId());
		System.out.println("name is " + manager.getName());
		System.out.println("salary is " + manager.getSalary());
		
		System.out.println("\nlocation is "+manager.getLocation());
		System.out.println("pf  is "+manager.getPf());
		System.out.println("gross salary  is "+(manager.getSalary()- (manager.getPf())));
		
	}

}
