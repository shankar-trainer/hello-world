package com.coforge.exception;

import java.util.Scanner;

public class DivisionProgram {
    Scanner scanner = new Scanner(System.in);

    int divide(int x, int y) {
        try {
            if (y <= 0)
                throw new ArithmeticException("denominator is zero");
            else
                return x / y;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("divide method finally called ");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("enter two number ");
        DivisionProgram program = new DivisionProgram();
        int a = program.scanner.nextInt();
        int b = program.scanner.nextInt();
        int z = program.divide(a, b);

        try {
            System.out.println("division is " + z);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println("main method finally");
            program.scanner.close();
        }
    }

}
