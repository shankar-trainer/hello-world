package cts.com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UserTest {

	User user,user1;
	
	@BeforeEach
	void setUp() throws Exception {
	  user=new User(1001,"ramesh","kumar");
	  user1=new User(1001,"ramesh","kumar");
	}

	@Disabled
	@Test
	void checkObject() {
		
	  assertEquals(user,user1);
	  
	}
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetUserId() {
		assertEquals(1001, user.getUserId());
	}

	@Test
	void testGetFname() {
		assertEquals("ramesh", user.getFname());
	}

	@Test
	void testGetLname() {
		assertEquals("kumar", user.getLname());
	}

}
