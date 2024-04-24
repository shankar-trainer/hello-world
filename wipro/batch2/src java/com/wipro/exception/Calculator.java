package com.wipro.exception;

public class Calculator {
    int division(int a, int b) throws Exception {
        if(b==0)
//            throw new ArithmeticException("division by zero error ");// ArithmeticException is unchecked (RuntimeException)
            throw new Exception("division by zero error ");// Exception is checked , must be handled
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("program starts ");
        int x=10;
        int y=0;
        try {
            System.out.println("Division is "+new Calculator().division(x,y));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("program ends ");
    }
}
