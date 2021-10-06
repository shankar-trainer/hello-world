
public class Employee {

	private int id;
	private String name;
	private float salary;
	private float pf;

	public float actualSalary() {
		return salary - (salary * pf/100);
	}

	public Employee(int id, String name, float salary, float pf) 
			throws EmployeeException {
		super();
		if(id<=0)
			throw new EmployeeException("id is -ve or 0");
		else
		this.id = id;
		if(name.isEmpty())
			throw new EmployeeException("name is empty");
		else if(name.length()<5)
			throw new EmployeeException("name length  less than 5 chars ");	
		else
		this.name = name;
		
		this.salary = salary;
		this.pf = pf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(pf);
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(pf) != Float.floatToIntBits(other.pf))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

}
