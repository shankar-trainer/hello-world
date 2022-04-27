package com.cts.mock.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class EmployeeTest {

	Employee employee;

	@Mock
	Department department;

	@BeforeEach
	void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
		employee = new Employee();

	}

	@Test
	void testId() {
		employee.setDepartment(department);
		when(department.getDeptId()).thenReturn(100);
		assertEquals(100, employee.getDepartment().getDeptId());
		verify(department).getDeptId();
	}

	@Test
	void testName() {
		employee.setDepartment(department);
		when(department.getDeptName()).thenReturn("training");
		assertEquals("training", employee.getDepartment().getDeptName());
		verify(department).getDeptName();
	}

}
