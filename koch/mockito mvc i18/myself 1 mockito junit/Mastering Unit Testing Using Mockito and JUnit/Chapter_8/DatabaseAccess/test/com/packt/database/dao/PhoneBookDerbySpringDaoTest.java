package com.packt.database.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.jdbc.core.JdbcTemplate;

import com.packt.database.model.PhoneEntry;

@RunWith(MockitoJUnitRunner.class)
public class PhoneBookDerbySpringDaoTest {

	@Mock
	JdbcTemplate mockJdbcTemplate;

	PhoneBookDerbySpringDao springDao;

	@Before
	public void init() {
		springDao = new PhoneBookDerbySpringDao(mockJdbcTemplate);
	}

	@Test
	public void creates_PhoneEntry() throws Exception {
		final String charlsPhoneNumber = "1234567";
		final String charlsFirstName = "Charles";
		final String charlsLastName = "Doe";

		PhoneEntry charles = new PhoneEntry();
		charles.setFirstName(charlsFirstName);
		charles.setLastName(charlsLastName);
		charles.setPhoneNumber(charlsPhoneNumber);

		when(
				mockJdbcTemplate.update(anyString(), anyObject(), anyObject(),
						anyObject())).thenReturn(1);

		assertTrue(springDao.create(charles));
		ArgumentCaptor<Object> varArgs = ArgumentCaptor.forClass(Object.class);
		ArgumentCaptor<String> strArg = ArgumentCaptor.forClass(String.class);

		verify(mockJdbcTemplate).update(strArg.capture(), varArgs.capture(),
				varArgs.capture(), varArgs.capture());
		assertEquals(charlsPhoneNumber, varArgs.getAllValues().get(0));
		assertEquals(charlsFirstName, varArgs.getAllValues().get(1));
		assertEquals(charlsLastName, varArgs.getAllValues().get(2));
	}

}
