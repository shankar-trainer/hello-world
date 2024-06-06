package com.coforge.exception;

public class ExceptionPrg1 {
    public static void main(String[] args) {
        System.out.println("program starts ");

        int ar[] = {1, 2, 3, 4, 5};
        System.out.println(ar[4]);
        //System.out.println(ar[5]);
        //ArrayIndexOutOfBoundsException

        System.out.println(10.0f / 0);//decimal  have infinity
        //System.out.println(10 / 0);// integer does not have infinity
        //ArithmeticException

        String name = null;
        //System.out.println("length "+name.length());
        //NullPointerException

        String city = "new delhi";
        System.out.println(city.charAt(20));
        //StringIndexOutOfBoundsException

        System.out.println("program ends ");
    }
}
