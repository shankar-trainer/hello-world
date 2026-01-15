package com.cts.exception;

public class ExceptionProgram1 {

    public static void main(String[] args) {
        System.out.println("start of program");
        System.out.println(10 / 0.0);
        System.out.println(-10 / 0.0);

        //System.out.println(10/0);//java.lang.ArithmeticException: / by zero
        int ar[] = {1, 2, 3};
        System.out.println(ar[2]);
//        System.out.println(ar[3]);//java.lang.ArrayIndexOutOfBoundsException

        String s = "hello";
//        System.out.println(s.charAt(5));//java.lang.StringIndexOutOfBoundsException

        String no = "123a";
//        int p=Integer.parseInt(no);//java.lang.NumberFormatException

//        System.out.println(p+20);

        String s2 = null;
        int d1 = s2.length();//java.lang.NullPointerException
        Integer p = null;
        Integer p1 = 8787879;

        System.out.println("end of program");
    }
}
