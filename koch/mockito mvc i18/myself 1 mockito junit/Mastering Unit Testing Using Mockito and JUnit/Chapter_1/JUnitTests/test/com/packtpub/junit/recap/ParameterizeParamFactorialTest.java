package com.packtpub.junit.recap;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizeParamFactorialTest {

	@Parameters(name = "{index}: factorial({0})={1}")
    public static Collection<Object[]> factorialData() {
        return Arrays.asList(new Object[][] {
                
                 { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, { 4, 24 }, { 5, 120 },{ 6, 720 }  
           });
    }
    
    @Parameter(value=0)
    public int number;
    @Parameter(value=1)
    public int expectedResult;

    
    @Test
	public void factorial() throws Exception {
    	Factorial fact = new Factorial();
		assertEquals(fact.factorial(number),expectedResult);
	}
}
