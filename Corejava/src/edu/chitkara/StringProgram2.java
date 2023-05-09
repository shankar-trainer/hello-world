package edu.chitkara;

import java.util.Scanner;

public class StringProgram2 {
public static void main(String[] args) {
	
	System.out.println("hello"=="hello"); // same object
	System.out.println("hello"==new String("hello"));// different object 
	System.out.println("hello".equals(new String("hello")));
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter two names ");
	
	String s1=scanner.next(); 
	String s2=scanner.next();
	System.out.println("s1 ==s2  " +s1==s2);
	System.out.println("s1 equals s2" +(s1.equals(s2)));
}
}
