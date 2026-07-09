package com.coforge.exception;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("program starts");
        System.out.println(10.0 / 0);
        System.out.println(-10.0 / 0);
//        System.out.println(10/0);//java.lang.ArithmeticException
        int ar[] = {1, 2, 3, 4, 5};

//        System.out.println(ar[5]);//java.lang.ArrayIndexOutOfBoundsException
        String s = "abc";
//        System.out.println(s.charAt(3));//java.lang.StringIndexOutOfBoundsException

        Integer s1=null;
        System.out.println(s1.intValue());// java.lang.NullPointerException
        System.out.println("program ends ");
    }

}
