package com.wipro.exception;

import java.util.Scanner;

public class InterestCalculation_Rethrow {
    static float amt;
    static float rate;
    static int time;

    static float calculation() throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter amount>0");
            amt = sc.nextFloat();
            if (amt <= 0)
                throw new Exception("invalid amount");
        } catch (Exception e) {
            System.err.println("Error at server is " + e.getMessage());
            throw e; // re throwing the exception
        }
        System.out.println("Enter rate>0");
        rate = sc.nextFloat();
        if (rate <= 0)
            //throw new RuntimeException("invalid rate");
            //RuntimeException and its subclasses are unckecked exception(handled)
            //It's not checked by the compiler
            throw new Exception("invalid rate");

        System.out.println("Enter time>0");
        time = sc.nextInt();
        if (time <= 0)
            throw new Exception("invalid time");
        //Exception and its sub classes are checked exceptions/ unhandled exceptions
        // it's checked by the compiler and force developer to handle it.
        return amt * rate * time / 100;
    }

    public static void main(String[] args) {
        System.out.println("program starts ");
        try {
            System.out.println(calculation());
        } catch (Exception e) {
            System.err.println("Error at client " + e.getMessage());
        }
        System.out.println("program ends ");
    }
}
/*

Exception and its sub classes are checked exceptions/ unhandled exceptions
 it's checked by the compiler and force developer to handle it.
 it is handled in two ways
1. using throws declare the exceptions with method
throws can throw multiple exceptions using comma sign

2. try catch
                                   caught
    player1   ---    ball ---------player3-----------------------------player2
                                    rethrow
*/


