package com.packt.bestpractices.setup;

import java.util.HashMap;

import org.junit.Before;

public abstract class BaseEmployeeTest {

	protected HashMap<String, Employee> employee ;
	
	@Before
	public void setUp() {
		employee = new HashMap<String, Employee>();
		employee.put("1", new Employee("English", "Will"));
		employee.put("2", new Employee("Cushing", "Robert"));
	}
}
