package com.cts.model;

import org.junit.jupiter.api.Assertions;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }


    @Test
    public void testCalculator() {
        assertNotNull(calculator);
    }

    @Test
    public void testString() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        assertEquals(s1, s2);
        assertEquals(s1, s3);
//         assertSame(s1,s3);  // assertSame checks references(==), assertEquals checks content(.equals)
        assertNotSame(s1, s3);
        assertSame(s1, s2);
    }

    @Test
    public void testAddition() {
//        Assertions.assertEquals(24.5f,calculator.addition(11.2f,13.30f));
        assertEquals(24.5f, calculator.addition(11.2f, 13.30f));
    }

    @Test
    public void testSubtraction() {
//        Assertions.assertEquals(2.0f,calculator.subtraction(11.2f,9.2f));
        assertEquals(2.0f, calculator.subtraction(11.2f, 9.2f));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(36.96f, calculator.multiplication(11.2f, 3.3f));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(0.8421052f, calculator.division(11.2f, 13.3f));
        Assertions.assertEquals(true,Float.isNaN(calculator.division(0.0f,0.0f)));
    }

    @Test
    public void testDivision1() {
        Assertions.assertEquals(Float.POSITIVE_INFINITY, calculator.division(11.2f, 0.0f));
    }

    @Test
    public void testint_Division() {
        Assertions.assertEquals(5, calculator.int_division(11, 2));
        Assertions.assertEquals(0, calculator.int_division(11, 12));
        assertThrows(ArithmeticException.class, () -> {
            Assertions.assertEquals(0, calculator.int_division(11, 0));
        });

    }

}
