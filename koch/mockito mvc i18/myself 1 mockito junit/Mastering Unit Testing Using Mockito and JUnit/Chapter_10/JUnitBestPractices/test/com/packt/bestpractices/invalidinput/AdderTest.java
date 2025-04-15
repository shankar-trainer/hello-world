package com.packt.bestpractices.invalidinput;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {
	Adder adder = new Adder();

	@Test(expected=IllegalArgumentException.class)
	public void should_throw_exception_when_encounters_a_NULL_input()  {
		adder.add(null, 1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_throw_exception_when_second_input_is_NULL()  {
		adder.add(2, null);
	}
	
	@Test
	public void should_return_zero_when_both_inputs_are_zero()  {
		int actual =adder.add(0, 0);
		assertEquals(0, actual);
	}
	
	@Test
	public void should_return_first_input_when_second_input_is_zero()  {
		int actual =adder.add(1, 0);
		assertEquals(1, actual);
	}
	
	@Test
	public void should_return_second_input_when_first_input_is_zero()  {
		int actual =adder.add(0, 2);
		assertEquals(2, actual);
	}
	
	@Test
	public void should_return_zero_when_summation_is_zero()  {
		int actual =adder.add(5, -5);
		assertEquals(0, actual);
	}
	
	@Test
	public void should_return_a_negative_when_both_inputs_are_negative()  {
		int actual =adder.add(-8, -5);
		assertTrue(actual < 0);
	}
	
	
	@Test
	public void should_overflow_when_summation_exceeds_integer_limit()  {
		int actual =adder.add(Integer.MAX_VALUE, 1);
		assertTrue(actual< 0);
	}
}
