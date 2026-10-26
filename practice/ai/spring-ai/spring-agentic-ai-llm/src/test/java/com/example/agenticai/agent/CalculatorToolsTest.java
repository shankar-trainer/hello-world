package com.example.agenticai.agent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorToolsTest {

    private final CalculatorTools calculatorTools = new CalculatorTools();

    @Test
    void calculatesBasicOperations() {
        assertEquals(5.0, calculatorTools.calculate(2, "add", 3));
        assertEquals(-1.0, calculatorTools.calculate(2, "subtract", 3));
        assertEquals(6.0, calculatorTools.calculate(2, "multiply", 3));
        assertEquals(2.0, calculatorTools.calculate(6, "divide", 3));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorTools.calculate(1, "divide", 0));
    }
}
