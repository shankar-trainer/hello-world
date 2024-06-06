package com.coforge.exception;

import java.util.Scanner;

public class Factorial {
    Scanner sc = new Scanner(System.in);

    long getFactorial() throws Exception {
        System.out.println("Enter No ");
        int p = sc.nextInt();
        if (p <= 0)
            //throw new RuntimeException("invalid no "); // RuntimeException is unchecked/handled exception
            try {
                throw new Exception("invalid no "); // Exception is checked exception
            }
        catch (Exception e){
            System.err.println("Error at factorial  method "+e.getMessage());
            throw e; // rethrowing exception
        }
        else {
            long fact = 1;
            for (int i = 1; i <= p; i++) {
                fact = fact * i;
            }
            return fact;
        }
       // return  -1;
    }

    public static void main(String[] args) {
        System.out.println("program starts ");
        try {
            System.out.println("factorial is " + new Factorial().getFactorial());
        } catch (Exception e) {
            System.err.println("Error at main method "+e.getMessage());
        }
        System.out.println("program ends ");
    }
}
