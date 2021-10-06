package com.flight.UserTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;

import com.flight.entities.User;
import com.flight.service.UserService;

/**
 * @author amitabh
 *
 */
@SpringBootTest
@Transactional
class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	/**
	 * Test method for
	 * {@link com.flight.service.UserServiceImpl#createUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	public void testCreateUser() {
		User u = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userService.createUser(u);
		User resultUser = (User) res.getBody();
		u.setUserId(resultUser.getUserId());
		assertEquals(u, resultUser);
		assertEquals(200, res.getStatusCodeValue());

	}

	/**
	 * Test method for
	 * {@link com.flight.service.UserServiceImpl#updateUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	public void testUpdateUser() {
		User u = new User("admin", "test user", "test user", "2323232323", "test@user");
		u = (User) userService.createUser(u).getBody();
		u.setUserName("new name");
		User u1 = (User) userService.updateUser(u).getBody();
		assertEquals(u, u1);
	}

	/**
	 * Test method for
	 * {@link com.flight.service.UserServiceImpl#viewUserById(java.math.BigInteger)}.
	 */
	@Test
	@Rollback
	public void testViewUserById() {
		User testUser = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userService.createUser(testUser);
		testUser = (User) res.getBody();
		BigInteger id = testUser.getUserId();
		User expectedUser = (User) userService.viewUserById(id).getBody();
		assertEquals(testUser.getUserId(), expectedUser.getUserId());
	}

	/**
	 * Test method for
	 * {@link com.flight.service.UserServiceImpl#validateUser(com.flight.entities.User)}.
	 */
	@Test
	@Rollback
	public void testValidateUser() {
		User testUser = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userService.createUser(testUser);
		testUser = (User) res.getBody();
		User dummyUser = new User("admin", "dummy user", "dummy user", "2323232322", "dummy@user");
		dummyUser.setUserId(new BigInteger("1111"));
		assertEquals(userService.validateUser(testUser), true);
		assertEquals(userService.validateUser(dummyUser), false);
	}

	/**
	 * Test method for {@link com.flight.service.UserServiceImpl#displayAllUsers()}.
	 */
	@Test
	public void testDisplayAllUsers() {
		List<User> lp = new ArrayList<>();
		User t1 = (User) userService.viewUserById(new BigInteger("1")).getBody();
		User t2 = (User) userService.viewUserById(new BigInteger("2")).getBody();
		lp.add(t1);
		lp.add(t2);
		assertEquals(userService.displayAllUsers(), lp);

	}

	/**
	 * Test method for
	 * {@link com.flight.service.UserServiceImpl#deleteUser(java.math.BigInteger)}.
	 */
	@Test
	@Rollback
	public void testDeleteUser() {
		User testUser = new User("admin", "test user", "test user", "2323232323", "test@user");
		ResponseEntity<?> res = userService.createUser(testUser);
		testUser = (User) res.getBody();
		assertEquals(userService.deleteUser(testUser.getUserId()), "User Deleted!!");

	}

}
