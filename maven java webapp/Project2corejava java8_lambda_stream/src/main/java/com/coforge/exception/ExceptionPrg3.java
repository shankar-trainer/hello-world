package com.coforge.exception;

import java.util.Scanner;

public class ExceptionPrg3 {

    public static void main(String[] args) {

        System.out.println("program starts ");
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter two no ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        try {
            System.out.println("division is " + a / b);
        }
        catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("finally block running ");
            scanner.close();
        }
        System.out.println("program ends");

    }

}
