package com.packtpub.junit.recap;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.Test;

public class Assumption {
   
	boolean isSonarRunning = false;
	@Test 
	public void very_critical_test() throws Exception {
		Assume.assumeFalse(isSonarRunning);
		assertTrue(true);
	}
	
}
