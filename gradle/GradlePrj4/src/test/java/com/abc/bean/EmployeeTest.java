package com.abc.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class EmployeeTest {
	@Mock
	Department department;
	Employee employee;
	
	@BeforeEach
	void setUp() throws Exception {
		//department= Mockito.mock(Department.class);
		MockitoAnnotations.initMocks(this);
		employee=new Employee();
	}

	@Test
	void testGetId() {
		employee.setDepartrment(department);
		
		Mockito.when(department.getDeptId()).thenReturn(78);
		assertEquals(78, employee.getDepartrment().getDeptId());
		System.out.println("department id  is "+employee.getDepartrment().getDeptId());
	}

	@Test
	void testGetName() {
		employee.setDepartrment(department);
		Mockito.when(department.getDeptName()).thenReturn("training");
		assertEquals("training", employee.getDepartrment().getDeptName());
		System.out.println("department name is "+employee.getDepartrment().getDeptName());
	}

	@Test
	void testLocation() {
		employee.setDepartrment(department);
		Mockito.when(department.getDeptLocation()).thenThrow(new RuntimeException("no department is set"));
		//assertEquals(8888, employee.getDepartrment().getDeptLocation());
		System.out.println("department location "+employee.getDepartrment().getDeptLocation());
	}

}
