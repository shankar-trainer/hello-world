package util;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Date;

public class Ex4 {

	public static void main(String[] args) {
		String s1 = "ate";
		String s2 = "eat";
		if (s1.length() != s2.length())
			System.out.println("not anagram");
		else {
			char c[] = s1.toCharArray();
			Arrays.sort(c);

			char c1[] = s2.toCharArray();
			Arrays.sort(c1);

			String s3 = Arrays.toString(c);
			String s4 = Arrays.toString(c1);
			if (s3.equals(s4))
				System.out.println("angram ");
			else
				System.out.println("not anagram ");
			
			System.out.println(s4+"   "+s3);
					
		}
	}
}
