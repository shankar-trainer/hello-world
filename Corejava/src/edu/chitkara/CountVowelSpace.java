package edu.chitkara;

import java.util.Scanner;

public class CountVowelSpace {

	static int[] countVowelSpace(String s) {
		int c[] = new int[2];
		int c1 = 0;
		int c2 = 0;
		for (char cc : s.toCharArray()) {
			if (cc == 'a' || cc == 'A' || cc == 'e' || cc == 'E' || cc == 'i' || cc == 'I' || cc == 'o' || cc == 'O'
					|| cc == 'u' || cc == 'U')
				c[0] = c1++;
			else if (cc == ' ')
				c[1] = c2++;
		}
		return c;
	}

	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		int[] c = countVowelSpace(s);
		System.out.println("No of vowel " + c[0]);
		System.out.println("No of space " + c[1]);
	}

}
