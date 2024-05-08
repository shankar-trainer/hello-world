package com.wipro.exception;

public class ExceptionProgram1 {
    public static void main(String[] args) {
        System.out.println("program starts\n");
        int ar[]={1,2,3,4,5};
        //System.out.println("5 th element "+ar[5]);//java.lang.ArrayIndexOutOfBoundsException

        String s1="hello";
        System.out.println("fifth char is "+s1.charAt(5));//StringIndexOutOfBoundsException

        String s2=null;
        //System.out.println("s2 length  is  "+s2.length());//NullPointerException

         String no="123a";
         int p=Integer.parseInt(no);//NumberFormatException
        System.out.println(no+ " no incremented is "+(++p));
        System.out.println("\nprogram ends");
    }
}
