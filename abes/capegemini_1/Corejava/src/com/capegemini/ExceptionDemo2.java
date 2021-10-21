package com.capegemini;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
	double p=0.0/0;
	
		System.out.println(p);

		System.out.println(Integer.MAX_VALUE);
		//2147483647
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int p1=scanner.nextInt();
	System.out.println(p1);
	
	//String n="1234a";
	String n="2147483649";
	int k=Integer.parseInt(n);
		
	}
}
