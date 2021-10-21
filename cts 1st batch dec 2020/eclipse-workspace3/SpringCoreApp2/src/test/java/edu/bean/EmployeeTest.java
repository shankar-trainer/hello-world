package edu.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee emp1, emp2;

	@BeforeEach
	void setUp() throws Exception {
		emp1 = new Employee();
		emp2 = new Employee();

		emp1.setId(1001);
		emp1.setName("a kumar");
		emp1.setSalary(12000);

		emp2.setId(1001);
		emp2.setName("a kumar");
		emp2.setSalary(12000);

	}

//test -Dtest=EmployeeTest
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(emp1, emp2);
	}

	@Test
	void testSalary() {
		assertEquals(12000.0f, emp1.getSalary());
	}

}
