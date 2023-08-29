package corejava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	User user;
	
	@BeforeEach
	void setUp() throws Exception {
	 user=new User();
	}

	@Test
	void test() {
		assertEquals(98898,user.userId);
		assertEquals(34000,user.userSalary);
		assertEquals("aman kumar",user.userName);
	}

}
