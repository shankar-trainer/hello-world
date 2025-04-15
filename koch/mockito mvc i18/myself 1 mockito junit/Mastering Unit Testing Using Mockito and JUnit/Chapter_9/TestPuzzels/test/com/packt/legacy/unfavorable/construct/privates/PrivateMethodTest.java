package com.packt.legacy.unfavorable.construct.privates;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrivateMethodTest {
	PrivateMethod privateMethod;
	
	@Before
	public void setUp() {
		privateMethod = new PrivateMethod();
	}
	
	@Test
	public void validate() throws Exception {
		privateMethod.validate(null);
	}
}
