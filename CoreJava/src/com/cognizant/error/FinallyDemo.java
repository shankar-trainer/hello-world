package com.cognizant.error;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scanner.nextLine();
		
		System.out.println("name is  " +name);
		try {
		System.out.println("last character is "+name.charAt(name.length()-1));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		finally {
			scanner.close();
			System.out.println("finally block");
		}
	}
}
