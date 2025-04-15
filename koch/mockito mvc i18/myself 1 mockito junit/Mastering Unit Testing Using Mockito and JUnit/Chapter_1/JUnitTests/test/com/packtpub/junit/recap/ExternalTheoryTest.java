package com.packtpub.junit.recap;
import static org.junit.Assert.assertEquals;

import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ExternalTheoryTest {

	@Theory
	public void adds_numbers(
			@ParametersSuppliedBy(NumberSupplier.class) Number num1,
			@ParametersSuppliedBy(NumberSupplier.class) Number num2) {
		Adder anAdder = new Adder();
		double expecteSum = num1.doubleValue()+num2.doubleValue();
		double actualResult = (Double)anAdder.add(num1, num2);
		assertEquals(actualResult, expecteSum, 0.01);
	}

}
