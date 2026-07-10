package com.coforge.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("test addition")
    public void additionTest() {
        Assertions.assertEquals(33, calculator.addition(11, 22));
    }

    @Test
    @DisplayName("test subtraction")
    public void subtractionTest() {
        Assertions.assertEquals(12, calculator.subtraction(20, 8));
    }

    @Test
    @DisplayName("test multiplication")
    public void multiplicationTest() {
//        Assertions.assertEquals(160, calculator.multiplication(20, 8));
        assertEquals(160, calculator.multiplication(20, 8));
    }

    @Test
    @DisplayName("test division")
    public void divisionTest() {
        assertEquals(2, calculator.division(20, 8));
    }

    @Test
    @DisplayName("test division with exception")
    public void divisionTest1() {
        assertThrows(ArithmeticException.class, ()->{calculator.division(20, 0);
        });
    }



}
