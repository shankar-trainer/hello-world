package com.cognizant.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDaoImplTest {
@Autowired
	EmployeeDaoImpl dao;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAddEmployee() {
	//	fail("Not yet implemented");
	}

	@Test
	void testRemoveEmployee() {
	}

	@Test
	void testSearchEmployee() {
	assertNotNull(dao.searchEmployee(1001));
	assertNull(dao.searchEmployee(9001));
	}

	@Test
	void testUpdateEmployee() {
	//	fail("Not yet implemented");
	}

	@Test
	void testShowAllEmployee() {
		//fail("Not yet implemented");
		
		assertEquals(3, dao.showAllEmployee().size());
		assertNotNull(dao.showAllEmployee());
	}

}
