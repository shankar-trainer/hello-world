package exception;

public class Customer {

	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) throws CustomerException {
		if (id <= 0)
			throw new CustomerException("invalid id ");
		else

			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws CustomerException {
		if (name.length() <= 5)
			throw new CustomerException("invalid name ");
		else
			this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) throws CustomerException {
		if (salary <= 0)
			throw new CustomerException("invalid salary ");
		else

			this.salary = salary;
	}

}
