package com.coforge.exception;

public class ExceptionProgram1 {

    public static void main(String[] args) {

        System.out.println("program starts ");

        System.out.println(10/0.0);
        System.out.println(-10/0.0);

        //System.out.println(-10/0);//java.lang.ArithmeticException

        int ar[]={1,2,3,4,5};
        //System.out.println(ar[5]);//java.lang.ArrayIndexOutOfBoundsException

        String name=null;

        //System.out.println(name.length());//java.lang.NullPointerException

         String city="delhi";
        //System.out.println(city.charAt(5));//StringIndexOutOfBoundsException


        System.out.println("program ends  ");



    }
}
