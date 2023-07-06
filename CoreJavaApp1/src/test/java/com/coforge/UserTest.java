package com.coforge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

	User user;

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("before each called");
		user = new User(1009, "rashi srivastava", 45000);
	}

	@Test
	public void testGetUserId() {
		   assertEquals(user.getUserId(), 1009);
	}

	@Test
	public void testGetUserName() {
		assertEquals(user.getUserName(),"rashi srivastava" );
	}

	@Test
	public void testGetUserSalary() {
		assertEquals(user.getUserSalary(),45000.0f,0.0f );
	}

}
