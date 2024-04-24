package com.wipro.exception;

public class ExceptionProgram {
    public static void main(String[] args) {
        System.out.println("program starts ");
        int ar[]={1,2,3,4,5};

        //System.out.println( ar[5]);//java.lang.ArrayIndexOutOfBoundsException
        System.out.println(ar[4]);

        System.out.println( 10/0.0);
        System.out.println( -10/0.0); // infinity is defined in float and double

        //System.out.println( 10/0);
        //java.lang.ArithmeticException

        String s1=null;

        System.out.println(s1.toUpperCase());// null pointer exception

        System.out.println("program ends  ");
    }
}
