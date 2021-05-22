package cts.com.database;

public class Employee {

	private int id;
	private String name;

	private Employee() {

	}

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

	static Employee emp;

	static Employee getEmployeeInstance() {
		if (emp == null)
			emp = new Employee();
		return emp;
	}

}
