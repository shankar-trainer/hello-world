/**
 * 
 */
package com.flight.UserTests;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.flight.dao.UserDao;
import com.flight.entities.User;

/**
 * @author amitabh
 *
 */
@SpringBootTest
@Transactional
class UserDaoTest {

	@Autowired
	private UserDao userDao;

	/**
	 * Test method for
	 * {@link com.flight.dao.UserDaoImpl#addUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	void testAddUser() {
		User u = new User("user", "test user", "testuser", "1234567890", "test@user");
		User u1 = userDao.addUser(u);
		u.setUserId(u1.getUserId());
		assertEquals(u, u1);
	}

	/**
	 * Test method for
	 * {@link com.flight.dao.UserDaoImpl#updateUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	void testUpdateUser() {
		User u = new User("user", "test user", "testuser", "1234567890", "test@user");
		User u1 = userDao.addUser(u);
		u1.setUserName("new name");
		assertEquals(u1, userDao.updateUser(u1));
	}

	/**
	 * Test method for
	 * {@link com.flight.dao.UserDaoImpl#viewUserById(java.math.BigInteger)}.
	 */
	@Test
	@Rollback
	void testViewUserById() {
		User u = new User("user", "test user", "testuser", "1234567890", "test@user");
		User u1 = userDao.addUser(u);
		assertEquals(u1, userDao.viewUserById(u1.getUserId()).get());

	}

	/**
	 * Test method for {@link com.flight.dao.UserDaoImpl#displayAllUsers()}.
	 */
	@Test
	@Rollback
	void testDisplayAllUsers() {
		User u1 = userDao.viewUserById(new BigInteger("1")).get();
		User u2 = userDao.viewUserById(new BigInteger("2")).get();
		List<User> lp = new ArrayList<>();
		lp.add(u1);
		lp.add(u2);
		assertEquals(lp, userDao.displayAllUsers());
	}

	/**
	 * Test method for
	 * {@link com.flight.dao.UserDaoImpl#validateUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	void testValidateUser() {
		User u1 = userDao.viewUserById(new BigInteger("1")).get();
		assertEquals(userDao.validateUser(u1), u1);
	}

	/**
	 * Test method for
	 * {@link com.flight.dao.UserDaoImpl#deleteUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	void testDeleteUser() {
		User u1 = userDao.viewUserById(new BigInteger("1")).get();
		assertTrue(userDao.deleteUser(u1));

	}

}
