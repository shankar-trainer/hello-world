package com.packt.legacy.unfavorable.construct.staticblock;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;


public class StaticBlockOwnerTest {

	StaticBlockOwner owner;
	
	@Before
	public void setUp()  {
		owner = new StaticBlockOwner();
	}
	
	@Test
	public void clean() throws Exception {
		owner.testMe();
	}
}
