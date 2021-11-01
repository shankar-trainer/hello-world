package app1;

public class Employee {
  private int id;
  private String name;
  private float salary;
  private Department dept;
  
  public void empInit() {
	  System.out.println("employee init called");
  }

  
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
}


public Employee(int id, String name, float salary, Department dept) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}
  
  
  
  
	
	
}
