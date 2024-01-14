package com.coforge.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.coforge.model.Customer;

class CustomerDaoImplTest {

	CustomerDao dao;

	@BeforeEach
	void setUp() throws Exception {
		dao = new CustomerDaoImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	Customer customer;

	@Test
	void testAddCustomer() {
		customer = new Customer();
		customer.setCustomerName("pranjal agarwal");
		customer.setCustomerSalary(28000);
		customer.setCustomerDob(LocalDate.of(2001, 1, 16));
		dao.addCustomer(customer);

		assertEquals(dao.getAllCustomer().size(), 1);
		List<Customer> allCustomer = dao.getAllCustomer();
		Customer c = allCustomer.get(0);

		assertEquals(c.getCustomerName(), "pranjal agarwal");
		assertEquals(c.getCustomerSalary(), 28000);
		assertEquals(c.getCustomerDob(), LocalDate.of(2001, 1, 16));
	}

	@Test
	void testSearchCustomer() {
		customer=null;
		customer = new Customer();
		customer.setCustomerName("anand kumar");
		customer.setCustomerSalary(48000);
		customer.setCustomerDob(LocalDate.of(2002, 10, 16));
		dao.addCustomer(customer);
		
		List<Customer> allCustomer = dao.getAllCustomer();
		Customer customer2 = allCustomer.get(0);
		assertEquals(dao.searchCustomer(customer2.getCustomerId()), customer);
	}

	@Test
	void testGetAllCustomer() {
	}

	@Test
	void testDeleteCustomer() {
	}

	@Test
	void testUpdateCustomer() {
	}

}
