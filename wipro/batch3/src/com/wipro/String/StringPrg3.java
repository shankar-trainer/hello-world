package com.wipro.String;

public class StringPrg3 {
    public static void main(String[] args) {

        String p1=new String("hello");
        char c1[]={'h','e','l','l','o'};
        String p2=new String(c1);// string is collection of character array
        String p3=new String(new  char[]{'a','b','c'});// using anonymous array

        System.out.println("hello world".length());
        System.out.println("hello world".toUpperCase());
        System.out.println("hello world".charAt(0));
        System.out.println("using toCharArray");
        char[] charArray = "hello world".toCharArray();

        for (char c : "hello world".toCharArray())
            System.out.print(c + ", ");

        String s1 = "hello world";
        System.out.println("\n using char at ");
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + ", ");
        }
        s1 = "we are learning java";
        String[] split = s1.split("");// no separator/delimiter
        // will split charater by character
        System.out.println("\nsplit without delimiter \n length of split array "+split.length);
        for (String s : split)
            System.out.print(s + ", ");

        split = s1.split(" ");// with single space separator/delimiter
        // will split charater by character
        System.out.println("\nsplit with space  delimiter \n length of split array "+split.length);

        for (String s : split)
            System.out.print(s + ", ");

    }
}
