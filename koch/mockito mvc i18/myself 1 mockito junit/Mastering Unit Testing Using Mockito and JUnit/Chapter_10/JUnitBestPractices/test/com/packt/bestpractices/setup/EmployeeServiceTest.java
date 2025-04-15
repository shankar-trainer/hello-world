package com.packt.bestpractices.setup;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeServiceTest extends BaseEmployeeTest {
     
	EmployeeService service;
	@Before
	public void setUp() {
		super.setUp();
		service = new EmployeeServiceImpl();
	}
	
	@Test
	public void someTest() throws Exception {
		for(Employee emp:employee.values()) {
			service.doSomething(emp);
		}
	}
}
