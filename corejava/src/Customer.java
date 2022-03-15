// encapsulated class 
public class Customer {
	private int id; // default access modifier
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.isEmpty() //|| name.isBlank()
				)
			System.out.println("name is blank");
		else if(name.length()<=5)
			System.out.println("invalid name length ");
		else
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	private float salary;

	public void setId(int id) {
		if (id <= 0)
			System.out.println("id is invalid ");
		else
			this.id = id;
	}

	public int getId() {
		return id;
	}
	
}
