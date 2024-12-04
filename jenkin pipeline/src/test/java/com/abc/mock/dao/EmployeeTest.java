package com.abc.mock.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmployeeTest {

	Department department;
	Employee employee;

	@BeforeEach
	void init() {
		department = Mockito.mock(Department.class);
		employee = new Employee();
	}

	@Test
	void testId() {
		employee.setDepartment(department);
		Mockito.when(department.getDeptId()).thenReturn(100);

		assertEquals(100, employee.getDepartment().getDeptId());

	}

}
