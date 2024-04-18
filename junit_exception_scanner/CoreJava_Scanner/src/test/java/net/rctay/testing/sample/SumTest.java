package net.rctay.testing.sample;

import static org.junit.Assert.*;

import net.rctay.testing.IOTest;
import net.rctay.testing.IOTestRule;

import org.junit.Rule;
import org.junit.Test;

public class SumTest {

	@Rule
	public IOTestRule ioTestRule = new IOTestRule();

	@Test
	@IOTest(main=Sum.class,
		input="3\n" +
			"10\n" +
			"2\n" +
			"7\n")
	public void test1() {
		assertEquals("19", ioTestRule.getLastLine());
	}

}
