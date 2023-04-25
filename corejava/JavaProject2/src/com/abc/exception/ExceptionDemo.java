package com.abc.exception;

/**
 * Created by shankar on 3/18/2023.
 */
public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("----- start of program--------\n");
        System.out.println(1.0f / 0);
        //       System.out.println(1/0);//java.lang.ArithmeticException: / by zero


        int arr[] = {1, 2, 3, 4, 5, 6};

        //  System.out.println(arr[6]);//java.lang.ArrayIndexOutOfBoundsException: 6

        String name="ram kumar"; // String is array of character
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        //System.out.println(name.charAt(9));//java.lang.StringIndexOutOfBoundsException: String index out of range: 9

        String city=null;
        System.out.println(city.length());//java.lang.NullPointerException
        System.out.println("\n----- end of program--------");
    }
}
