package cts.java8.lambda;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private float salary;

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;
		return 0;
	}

}
