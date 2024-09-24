package com.coforge.exception;

import java.util.Scanner;

public class FinallyProgram {
    String fullName(String fname, String lname)
            throws Exception {
        try {
            if (fname.length() < 5)
                throw new Exception("invalid fname");
            else if (lname.length() < 5)
                throw new Exception("invalid lname");

        } catch (Exception e) {
            System.err.println("error at method fullName " + e.getMessage());
            // rethrow the exception
            throw e;
        }
         //else
        return fname + " " + lname;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fn, ln;

        System.out.println("Enter First Name >5 character");
        fn = scanner.next();

        System.out.println("Enter Last Name >5 character");
        ln = scanner.next();

        try {
            System.out.println("Full Name is " + new FinallyProgram().fullName(fn, ln));
        } catch (Exception e) {
            System.err.println("error at main method " + e.getMessage());
        }
        System.out.println("finally called ");
        scanner.close();

        System.out.println("program ends ..........");

    }


}
