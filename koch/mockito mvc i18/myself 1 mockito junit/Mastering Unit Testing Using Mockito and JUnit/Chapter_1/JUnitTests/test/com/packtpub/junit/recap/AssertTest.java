package com.packtpub.junit.recap;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AssertTest {

	@Test
	public void assertTrueAndFalseTest() throws Exception {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
	
	@Test
	public void assertNullAndNotNullTest() throws Exception {
		Object myObject = null;
		Assert.assertNull(myObject);
		
		myObject = new String("Some value");
		Assert.assertNotNull(myObject);
	}
	
	@Test
	public void assertEqualsTest() throws Exception {
		Integer i = new Integer("5");
		Integer j = new Integer("5");;
		assertEquals(i,j);
	}
	
	@Test
	public void assertNotSameTest() throws Exception {
		Integer i = new Integer("5");
		Integer j = new Integer("5");;
		assertNotSame(i,j);
	}
	
	@Test
	public void assertSameTest() throws Exception {
		Integer i = new Integer("5");
		Integer j = i;
		assertSame(i,j);
	}
		@Test
		@Ignore("John's holiday stuff failing")
		public void when_today_is_holiday_then_stop_alarm() throws Exception {
			
		}
}
