package edu.chitkara;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();

		String s1 = buffer.toString();

		if (s.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}
}
