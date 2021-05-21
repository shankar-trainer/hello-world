package com.cts.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.exception.EmployeeException;
import com.cts.model.Employee;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)

class EmployeeServiceTest {

	@Autowired
	EmployeeService service;

	Employee employee1, employee2, employee3;

	@BeforeEach
	void setUp() throws Exception {
		employee1 = new Employee();
		employee2 = new Employee();

		employee1.setEmpId(7001);
		employee1.setEmpName("suman kumar");
		employee1.setEmpSalary(45000);

		employee2.setEmpId(7002);
		employee2.setEmpName("pawan kumar");
		employee2.setEmpSalary(40000);

		employee3 = new Employee();
		employee3.setEmpId(7003);
		employee3.setEmpName("rajendra kumar");
		employee3.setEmpSalary(34000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Order(1)
	void testSavemployee() throws EmployeeException {
		service.savemployee(employee1);
		service.savemployee(employee2);
		service.savemployee(employee3);

		assertEquals(service.getAllEmployee().size(), 3);
	}

	@Test
	@Order(2)
	void testGetAllEmployee() throws EmployeeException {
		assertNotNull(service.getAllEmployee());
	}

}
