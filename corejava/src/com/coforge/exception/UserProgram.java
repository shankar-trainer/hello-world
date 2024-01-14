package com.coforge.exception;

import java.util.Scanner;

public class UserProgram {

	static String fullName(String fn, String ln) throws Exception {
		if (fn.length() < 5)
//        	throw new RuntimeException("first name must of 5 character ");
			throw new Exception("first name must of 5 character ");
		if (ln.length() < 5)
			throw new Exception("last name must of 5 character ");

		return fn + " " + ln;
	}
	static String fullName1(String fn, String ln) throws Exception {
		try {
		if (fn.length() < 5)
			throw new Exception("first name must of 5 character ");
		if (ln.length() < 5)
			throw new Exception("last name must of 5 character ");
		}
		catch (Exception e) {
			System.out.println("caught at fullName1 method "+e.getMessage());
			//throw e;// re throwing exception e 
		}
		return fn + " " + ln;
	}

	public static void main(String[] args) {
		System.out.println("program starts ");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First name and last name");
		try {
			System.out.println("Full name is " + fullName1(scanner.next(), scanner.next()));
		} catch (Exception e) {
			System.err.println("caught at main method "+e.getMessage());
		}

		scanner.close();
		System.out.println("program ends  ");
	}

}
