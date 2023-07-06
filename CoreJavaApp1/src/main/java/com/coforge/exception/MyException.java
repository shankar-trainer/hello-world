package com.coforge.exception;

import java.util.Scanner;

public class MyException {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc=new Scanner(System.in);
			System.out.println("Enter no ");
	//		Integer x = "null";
			Integer x = sc.nextInt();
			System.out.println(x);
			System.out.println(x.toString());
			int ar[] = { 1, 2, 3, 4 };
			System.out.println(ar[5]);
		} 
		catch (NullPointerException|ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		finally {
			sc.close();
			System.out.println("finally block");
		}
	}
}
