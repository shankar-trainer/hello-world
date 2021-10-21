import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee employee1;
	Employee employee2;
	
	@Before
	public void setUp() throws EmployeeException {
	employee1=new Employee(2330, "ram kumar", 20000, 10.0f);
	employee2=new Employee(2330, "ram kumar", 20000, 10.0f);
	}
	
	@After
	public void tearDown() throws Exception {
	employee1=null;
	employee2=null;
	}

	@Test
	public void testEmployeeEquals() {
		assertEquals(employee1, employee2);
	}
	
	
	@Test
	public void testActualSalary() {
      assertEquals(18000.0f, employee1.actualSalary(),0.0f);
	}

}
