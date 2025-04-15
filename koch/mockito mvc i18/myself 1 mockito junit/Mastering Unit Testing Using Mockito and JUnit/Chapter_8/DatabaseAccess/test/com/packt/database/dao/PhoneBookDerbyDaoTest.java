package com.packt.database.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.internal.verification.Times;
import org.mockito.runners.MockitoJUnitRunner;

import com.packt.database.model.PhoneEntry;

@RunWith(MockitoJUnitRunner.class)
public class PhoneBookDerbyDaoTest {
	@Mock
	Connection mockConn;
	@Mock
	PreparedStatement mockPrepStmt;
	@Mock
	ResultSet mockResultSet;

	PhoneBookDao dao;

	@Before
	public void setUp() {
		dao = new TestablePhoneBookDerbyDao();
	}

	@Test
	public void creates_phone_entry() throws Exception {
		PhoneEntry johnDoe = new PhoneEntry();
		johnDoe.setFirstName("John");
		johnDoe.setLastName("Doe");
		johnDoe.setPhoneNumber("983999996");

		when(mockConn.prepareStatement(anyString())).thenReturn(mockPrepStmt);

		boolean succeed = dao.create(johnDoe);
		assertTrue(succeed);

		ArgumentCaptor<String> stringArgCaptor = ArgumentCaptor
				.forClass(String.class);
		ArgumentCaptor<Integer> intArgCaptor = ArgumentCaptor
				.forClass(Integer.class);
		verify(mockPrepStmt, new Times(3)).setString(intArgCaptor.capture(),
				stringArgCaptor.capture());

		assertEquals("983999996", stringArgCaptor.getAllValues().get(0));
		assertEquals("John", stringArgCaptor.getAllValues().get(1));
		assertEquals("Doe", stringArgCaptor.getAllValues().get(2));

		verify(mockConn).prepareStatement(stringArgCaptor.capture());
		assertEquals(PhoneBookDerbyDao.INSERT_INTO_PHONE_BOOK_VALUES,
				stringArgCaptor.getValue());

		verify(mockPrepStmt).executeUpdate();
		verify(mockConn).commit();
		verify(mockPrepStmt).close();
		verify(mockConn).close();

	}

	@Test
	public void retrieves_phone_entry() throws Exception {
		when(mockConn.prepareStatement(anyString())).thenReturn(mockPrepStmt);
		when(mockPrepStmt.executeQuery()).thenReturn(mockResultSet);
		when(mockResultSet.next()).thenReturn(true).thenReturn(false);
		
		when(mockResultSet.getString("fname")).thenReturn("John");
		when(mockResultSet.getString("lname")).thenReturn("Doe");
		when(mockResultSet.getString("num")).thenReturn("123");
		
		List<PhoneEntry> phoneEntries = dao.searchByNumber("123");
		
		assertEquals(1, phoneEntries.size());
		PhoneEntry johnDoe = phoneEntries.get(0);
		
		assertEquals("John", johnDoe.getFirstName());
		assertEquals("Doe", johnDoe.getLastName());
		assertEquals("123", johnDoe.getPhoneNumber());
		
		verify(mockResultSet).close();
		verify(mockPrepStmt).close();
		verify(mockConn).close();
	}

	class TestablePhoneBookDerbyDao extends PhoneBookDerbyDao {
		protected void loadDriver() {

		}

		protected Connection getConnection() throws SQLException {
			return mockConn;
		}
	}
}
