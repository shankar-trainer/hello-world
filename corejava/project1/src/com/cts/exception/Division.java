package com.cts.exception;

import java.io.FileNotFoundException;

public class Division {

    int  division(int a, int b) throws Exception, FileNotFoundException {
        try {
            if (b == 0)
//            throw new RuntimeException("second number is invalid");
                //RuntimeException is unchecked exception, not force
                throw new Exception("second number is invalid");
                //Exception is checked exception, checked by compiler
            //else
              //  return a / b;
        } catch (Exception e) {
            System.out.println("error at division method "+e.getMessage());
            throw e;//
//            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("start of program");
        try {
            System.out.println(new Division().division(11,0));
        } catch (Exception e) {
            System.out.println("error at main method  "+e.getMessage());
        }
        System.out.println("end of program");
    }
}
