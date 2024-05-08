package com.wipro.String;

import java.util.Scanner;

public class StringPrg5 {

    public static void main(String[] args) {

        System.out.println("hello" == "hello");
        System.out.println("hello" == new String("hello"));
        System.out.println("hello".equals(new String("hello")));
        System.out.println("enter name");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ram"== scanner.next());// false

        System.out.println("enter name");
        System.out.println("ram".equals(scanner.next()));// true
        //user input with scanner always produces string object outside string pool
    }
}
