package org.coforge.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	Employee employee;

	@BeforeEach
	public void setUp() throws Exception {
		employee = new Employee();
		employee.setEmpId(565465);
		employee.setEmpName("suman kumar");
		employee.setEmpSalary(20000);
		employee.setEmpPf(0.05f);
		employee.setEmpGrossSalary(employee.getEmpSalary() - (employee.getEmpSalary() * employee.getEmpPf()));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(employee.getEmpId(), 565465);

	}

}
