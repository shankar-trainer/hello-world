package edu.chitkara;

import java.util.Scanner;

public class StringProgram3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two name");
		
		String s1=scanner.next();
		String s2=scanner.next();

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		scanner.close();
		
	}
}
