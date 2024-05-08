package com.wipro.exception;

public class ExceptionProgram3 {
    public static void main(String[] args) {
        System.out.println("program starts\n");
        int ar[] = {1, 2, 3, 4, 5};
        String s="hello";
        try {
            //System.out.println("5 th element " + ar[5]);//java.lang.ArrayIndexOutOfBoundsException
            System.out.println("5 the char is "+s.charAt(5));
        }
        catch (StringIndexOutOfBoundsException|ArrayIndexOutOfBoundsException e ){
            System.err.println("error is "+e.getMessage());
        }

        catch (Exception e) {
            System.out.println("some error ");
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("\nprogram ends");
    }
}
