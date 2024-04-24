package com.wipro.exception;

public class ExceptionProgram1 {
    public static void main(String[] args) {
        System.out.println("program starts ");
        int ar[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(ar[5]);
        }
        catch (Exception e){
            System.out.println("array index error ");
        }
        System.out.println("program ends ");
    }
}
