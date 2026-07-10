package com.coforge.model;

public class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("divide by zero error");
        return a / b;
    }


}
