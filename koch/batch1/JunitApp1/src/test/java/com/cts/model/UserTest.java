package com.cts.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

	User user,user1;

	@BeforeEach
	public void init() {
		user = new User(4545455, "ratanakar kumar", 44);
		user1 = new User(4545455, "ratanakar kumar", 44);
	}
	
	@Test
	public void testUser() {
		assertNotNull(user);
		assertEquals(user, user1);
	}

	@Test
	public void testUserId() {
     assertEquals(4545455, user.getUserId());
	}
	
	@Test
	public void testUserName() {
		assertEquals("ratanakar kumar", user.getUserName());
		
	}
	@Test
	public void testUserAge() {
		assertEquals(44, user.getUserAge());
	}

}
