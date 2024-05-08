package com.wipro.exception;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)) {
            int i = scanner.nextInt();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
