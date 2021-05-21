package com.cts.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.cts.exception.ConsumerException;
import com.cts.model.Consumer;
import com.cts.util.ApplicationUtil;
import com.cts.util.DbConnectionManager;

@TestMethodOrder(OrderAnnotation.class)
class ConsumerDaoTest {

	ConsumerDao dao;
	Connection con;
	Statement st;

	@BeforeEach
	void setUp() throws Exception {
		con = DbConnectionManager.myConnection();
		st = con.createStatement();
		dao = new ConsumerDao();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Order(1)
	@Test
	void testAddConsumer() throws ParseException, SQLException, ConsumerException {
		st.executeUpdate("delete from consumer");
		Consumer consumer = new Consumer();
		consumer.setId(1001);
		consumer.setName("pankaj kumar");
		consumer.setSalary(20000);
		consumer.setDob(ApplicationUtil.checkDateFormat("12-11-1999"));
		dao.addConsumer(consumer);
		
		consumer = null;
		consumer = new Consumer();
		consumer.setId(1002);
		consumer.setName("amit kumar");
		consumer.setSalary(30000);
		consumer.setDob(ApplicationUtil.checkDateFormat("12-12-1998"));
		dao.addConsumer(consumer);
		
		assertEquals(2, dao.getAllConsumer().size());
	}

	@Order(2)
	@Test
	void testSearchConsumer() throws SQLException, ConsumerException {
		Consumer consumer = new Consumer();
		consumer.setId(1001);
		assertNotNull(dao.searchConsumer(consumer));
	}

	@Test
	void testUpdateConsumer() {
	}

	@Order(4)
	@Test()
	void testDeleteConsumer() {
		Consumer consumer = new Consumer();
		consumer.setId(1001);;
		try {
		         assertNotNull(	dao.deleteConsumer(consumer));
		
		} catch (SQLException | ConsumerException e) {
			e.printStackTrace();
		}
	}

	@Order(3)
	@Test
	void testGetAllConsumer() throws SQLException, ConsumerException {
		assertEquals(2, dao.getAllConsumer().size());
	    
	}

}
