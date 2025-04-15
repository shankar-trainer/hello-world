package com.cts.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//mvn test -Dtest="EmployeeTest"
class EmployeeTest {

	Employee emp;
	Employee emp1;

	@BeforeEach
	void setUp() throws Exception {
		emp = new Employee();
		emp1 = new Employee();

		emp.setId(10001);
		emp.setName("anand partap");
		emp.setSalary(12000);

		emp1.setId(10001);
		emp1.setName("anand partap");
		emp1.setSalary(12000);

	}

	@Test
	void testGetId() {
		assertEquals(10001, emp.getId());
	}

	@Test
	void testGetName() {
		assertEquals("anand partap", emp.getName());
	}

	@Test
	void testGetSalary() {
		assertEquals(12000, emp.getSalary());
	}

	@Test
	void testEquals() {
		assertEquals(emp, emp1);
	}

}
