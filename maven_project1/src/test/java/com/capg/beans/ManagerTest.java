package com.capg.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.beans.Manager;

public class ManagerTest {

	Manager manager;

	@BeforeEach
	void init() {
		manager = new Manager();
		manager.setId(7879877);
		manager.setName("ananaya sharma");
		manager.setLocation("mathura");
		manager.setSalary(20000);
		manager.setPf(5);
		manager.setHra(10);
	}

	@Test
	void testEmpInfo() {
		manager.empInformation();
	}
}
