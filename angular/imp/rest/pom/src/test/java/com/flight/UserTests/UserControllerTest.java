/**
 * 
 */
package com.flight.UserTests;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;

import com.flight.controllers.UserController;
import com.flight.entities.User;

/**
 * @author amitabh
 *
 */
@SpringBootTest
@Transactional
class UserControllerTest {
	@Autowired
	private UserController userController;

	/**
	 * Test method for
	 * {@link com.flight.controllers.UserController#addUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	void testAddUser() {
		User u = new User("admin", "test user", "test user","2323232323", "test@user");
		ResponseEntity<?> res = userController.addUser(u);
		User resultUser = (User) res.getBody();
		u.setUserId(resultUser.getUserId());
		assertEquals(u, resultUser);
		assertEquals(200, res.getStatusCodeValue());
	}

	/**
	 * Test method for
	 * {@link com.flight.controllers.UserController#viewUser(java.math.BigInteger)}.
	 */
	@Test
	void testViewUser() {
		User testUser = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userController.addUser(testUser);
		testUser = (User) res.getBody();
		BigInteger id = testUser.getUserId();
		User expectedUser = (User) userController.viewUser(id).getBody();
		assertEquals(testUser.getUserId(), expectedUser.getUserId());
	}

	/**
	 * Test method for
	 * {@link com.flight.controllers.UserController#updateUser(com.flight.entities.User)}.
	 */
	@Test
	void testUpdateUser() {
		User u = new User("admin", "test user", "test user", "2323232323", "test@user");
		u = (User) userController.addUser(u).getBody();
		u.setUserName("new name");
		User u1 = (User) userController.updateUser(u).getBody();
		assertEquals(u, u1);
		
	}

	/**
	 * Test method for
	 * {@link com.flight.controllers.UserController#validateUser(com.flight.entities.User)}.
	 */
	@Test
	void testValidateUser() {
		User testUser = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userController.addUser(testUser);
		testUser = (User) res.getBody();
		User dummyUser = new User("admin", "dummy user", "dummy user","2323232322", "dummy@user");
		dummyUser.setUserId(new BigInteger("1111"));
		assertEquals(userController.validateUser(testUser), "valid user");
		assertEquals(userController.validateUser(dummyUser), "invalid user");
	}

	/**
	 * Test method for {@link com.flight.controllers.UserController#getUsers()}.
	 */
	@Test
	void testGetUsers() {
		User testUser = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userController.addUser(testUser);
		testUser = (User) res.getBody();
		BigInteger id = testUser.getUserId();
		User expectedUser = (User) userController.viewUser(id).getBody();
		assertEquals(testUser.getUserId(), expectedUser.getUserId());
	}

	/**
	 * Test method for
	 * {@link com.flight.controllers.UserController#deleteUser(java.math.BigInteger)}.
	 */
	@Test
	void testDeleteUser() {
		User testUser = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userController.addUser(testUser);
		testUser = (User) res.getBody();
		assertEquals(userController.deleteUser(testUser.getUserId()), "User Deleted!!");
	}


}
