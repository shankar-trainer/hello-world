import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class EmployeeTest2 {
	int id;
	String name;
	float salary;
	float pf;
	
	Employee employee;
	
	public EmployeeTest2(int id, String name, float salary, float pf) throws EmployeeException {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pf = pf;
		employee=new Employee(id, name, salary, pf);
	}
	@Test
	public void Test1() {
		assertEquals(salary, employee.getSalary(),0.0f);
		assertEquals(name, employee.getName());
	}
	
	
	 @Parameterized.Parameters()
	    public static final Object[] getEmp() {
		 return new Object[]{
	                new Object[]{1001, "ram kumar", 20000, 0.1f},
	                new Object[]{1002, "mohan kumar", 30000, 0.2f},
	                new Object[]{10, "som", 40000, 0.33f},
	                new Object[]{1007, "mohan kumar", 60000, 0.44f}
	        };
	 }
}
