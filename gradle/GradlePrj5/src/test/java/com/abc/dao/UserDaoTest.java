package com.abc.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.abc.bean.User;

@TestMethodOrder(OrderAnnotation.class)
public class UserDaoTest {

	static UserDao dao;
	static User user[];

	//@BeforeEach
	
	@BeforeAll
	static void setUp() throws Exception {
		System.out.println(" set called ");
		dao = new UserDao();

		user = new User[4];
		user[0] = new User(554456, "s kumar", 67000, "chennai");
		user[1] = new User(554456, "p kumar", 17000, "delhi");
		user[2] = new User(554456, "a kumar", 69000, "noida");
		user[3] = new User(554456, "j kumar", 87000, "gurgaon");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Order(1)
	@Test
	void testAddUser() {
		System.out.println("1.add user called ");
		for (User user2 : user) {
			dao.addUser(user2);
		}
		assertEquals(4, dao.getAllUser().size());
	}

	@Order(2)
	@Test
	void testRemoveUser() {
		System.out.println("2. remove  user called ");
		assertEquals(4, dao.getAllUser().size());
		dao.removeUser(user[0]);
    	assertNull(dao.searchUser(user[0]));
    	assertEquals(3, dao.getAllUser().size());

	}

	@Test
	@Order(3)
	void testSearchUser() {
		System.out.println("3. search  user called ");
		assertNull(dao.searchUser(user[0]));
		//assertNull(dao.searchUser(user[2]));
		//assertNotNull(dao.searchUser(user[1]));
		
	}

	@Test
	@Order(4)
	void testGetAllUser() {
		System.out.println("4. all user called ");
		assertNotNull(dao.getAllUser());
		assertEquals(3, dao.getAllUser().size());
	}

}
