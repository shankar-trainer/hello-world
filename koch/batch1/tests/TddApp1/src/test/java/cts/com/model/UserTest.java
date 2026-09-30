package cts.com.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

	User user;
	User user1;

	@BeforeEach
	public void init() {
		user = new User();
		user1 = new User();
		user.setUserId(7878787);
		user.setUserName("devansh sharma");
		user.setUserSalary(23000.78f);

		user1.setUserId(7878787);
		user1.setUserName("devansh sharma");
		user1.setUserSalary(23000.78f);
	}

	@Test
	public void test1() {
		assertNotNull(user);
		assertEquals(7878787, user.getUserId());
		assertEquals("devansh sharma", user.getUserName());
		assertEquals(23000.78f, user.getUserSalary());
		assertSame("devansh sharma", user.getUserName());

		assertEquals(user, user1);
	}

	@Test
	public void test2() {
		String var1 = "hello";
		String var2 = "hello";
		String var3 = new String("hello");

		System.out.println(var1 == var2); // == checks references
		System.out.println(var1.equals(var2)); // .equals checks content

		assertSame(var1, var2); // checks references
		assertEquals(var1, var2); // checks references

		assertEquals(var1, var3);
		// assertSame(var1, var3);// will not work
	}

}
