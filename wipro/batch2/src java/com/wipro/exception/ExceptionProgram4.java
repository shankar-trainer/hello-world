package com.wipro.exception;

import java.util.Scanner;

public class ExceptionProgram4 {
    public static void main(String[] args) {
        System.out.println("program starts ");

        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter id ");
            int id = scanner.nextInt();

            System.out.println("Enter name ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.println("Id is " + id);
            System.out.println("Name is " + name);

            System.out.println("program ends ");
        }
        catch (Exception e){
            System.err.println("Exception is ");
            System.err.print(e.getMessage());
        }
        finally {
            System.out.println("finally block ");
            scanner.close();
        }
        System.out.println("program ends ");
    }
}
