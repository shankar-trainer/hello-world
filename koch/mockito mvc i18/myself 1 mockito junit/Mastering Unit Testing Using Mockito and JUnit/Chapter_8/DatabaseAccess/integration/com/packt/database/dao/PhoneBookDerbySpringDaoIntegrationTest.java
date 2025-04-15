package com.packt.database.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.packt.database.model.PhoneEntry;

@ContextConfiguration({ "classpath:integration.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class PhoneBookDerbySpringDaoIntegrationTest {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	PhoneBookDerbySpringDao springDao;

	@Before
	public void init() {
		springDao = new PhoneBookDerbySpringDao(jdbcTemplate);
	}

	@Test
	public void integration() throws Exception {
		PhoneEntry entry = newEntry("12345", "John", "Smith");
		//create
		assertTrue(springDao.create(entry));
		//retrieve
		List<PhoneEntry> phoneEntries = springDao.searchByFirstName("John");
		//verify create
		assertFalse(phoneEntries.isEmpty());

		//modify last name
		entry.setLastName("Kallis");
		//update
		assertTrue(springDao.update(entry));
		//retrieve
		phoneEntries = springDao.searchByFirstName("John");
		//verify update
		assertFalse(phoneEntries.isEmpty());
		assertEquals("Kallis", phoneEntries.get(0).getLastName());

		//delete
		springDao.delete(entry.getPhoneNumber());
		//retrieve
		phoneEntries = springDao.searchByFirstName("John");
		//verify delete
		assertTrue(phoneEntries.isEmpty());

	}

	protected PhoneEntry newEntry(String phoneNumber, String firstName,
			String lastName) {
		PhoneEntry number = new PhoneEntry();
		number.setFirstName(firstName);
		number.setLastName(lastName);
		number.setPhoneNumber(phoneNumber);
		return number;
	}

}
