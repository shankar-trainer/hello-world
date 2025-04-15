package com.packtpub.junit.recap;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeOutTest {

	@Test(timeout=10)
	public void forEver() throws Exception {
		Thread.sleep(100);
	}
}
