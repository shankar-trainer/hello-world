package com.math.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputOutputTest {
    @Test
    public void shouldTakeUserInput() {
        InputOutput inputOutput= new InputOutput();

        String input = "add 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Assertions.assertEquals("add 5", inputOutput.getInput());
    }

}
