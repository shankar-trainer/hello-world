package com.packtpub.junit.recap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SanityTest {

	@Before
	public void before() {
		System.out.println("____________________");
		System.out.println("\tBefore is invoked");
	}
	
	@After
	public void after() {
		System.out.println("\tAfter is invoked");
		System.out.println("=================");
	}
	
	@Test
	public void someTest() {
		System.out.println("\t\tsomeTest is invoked");
	}
	
	@Test
	public void someTest2() {
		System.out.println("\t\tsomeTest2 is invoked");
	}
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("***Before Class is invoked");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("***After Class is invoked");
	}
}
