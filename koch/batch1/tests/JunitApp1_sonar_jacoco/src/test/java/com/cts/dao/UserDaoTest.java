package com.cts.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cts.model.User;

class UserDaoTest {

	UserDao dao;
	
	@BeforeEach
	void setUp() throws Exception {
		dao=new UserDao();
		user1=new User(10001, "somesh", 30);
			dao.addUser(user1);
			dao.addUser(new User(10002, "piyush", 32));
			dao.addUser(new User(10003, "jayant", 20));
			dao.addUser(new User(10004, "mukesh", 36));
	}

	User user1;
	@Test
	void testAddUser() {
	
	}

	@Test
	void testGetAllUser() {
		assertEquals(4, dao.getAllUser().size());
	}

	@Test
	void testSearchUser() {
		assertTrue(	dao.searchUser(user1));
		assertTrue(	dao.searchUser(new User(10001, "somesh", 30)));
	}
	

}
