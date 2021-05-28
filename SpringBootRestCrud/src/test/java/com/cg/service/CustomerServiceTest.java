package com.cg.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dao.CustomerRepository;
import com.cg.error.CustomerException;
import com.cg.model.Customer;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class CustomerServiceTest {

	@Autowired
	CustomerService service;

	@Autowired
	CustomerRepository dao;

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	Customer c[] = new Customer[3];

	@Test
	@Order(1)
	void testAddCustomer() throws CustomerException {
		dao.deleteAll();

		c[0] = new Customer();
		c[0].setCustomerId(9007);
		c[0].setCustomerName("amit kumar");
		c[0].setCustomerSalary(12000f);

		c[1] = new Customer();
		c[1].setCustomerId(9001);
		c[1].setCustomerName("ranjeet kumar");
		c[1].setCustomerSalary(11000f);

		c[2] = new Customer();
		c[2].setCustomerId(90010);
		c[2].setCustomerName("suresh kumar");
		c[2].setCustomerSalary(450000f);

		for (Customer customer : c) {
			service.addCustomer(customer);
		}

		assertEquals(dao.findById(9007).get(), c[0]);
		assertEquals(dao.findById(9001).get(), c[1]);
		assertEquals(dao.findById(90010).get(), c[2]);

	}

	@Test
	@Order(3)
	void testDeleteCustomer() throws CustomerException {
		// dao.deleteById(9007);
		Customer customer = new Customer();
		customer.setCustomerId(9007);
		service.deleteCustomer(customer);
		assertEquals(2, dao.findAll().size());
	}

	@Test
	@Order(4)
	void testSearchCustomer() throws CustomerException {
		Customer customer = new Customer();
		customer.setCustomerId(9001);
		assertTrue(service.searchCustomer(customer)!=null);
	}

	@Test
	@Order(2)
	void testGetAllCustomer() {
		assertEquals(3, dao.findAll().size());
	}

}
