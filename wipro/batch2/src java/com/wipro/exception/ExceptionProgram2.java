package com.wipro.exception;

public class ExceptionProgram2 {
    public static void main(String[] args) {
        System.out.println("program starts ");
        int ar[] = {1, 2, 3, 4, 5};
        //String s=null;
        String s = "null";

        try {
            System.out.println(ar[5]);
            System.out.println(s.length());
            System.out.println(10 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            //    System.out.println("array index error ");
            //System.out.println(e);
            //System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            //System.out.println("null error ");
            System.err.println(e.getMessage());
        } catch (Exception e) {
            //System.out.println("some error ");
            System.err.println(e.getMessage());
        }
        System.out.println("program ends ");
    }
}
