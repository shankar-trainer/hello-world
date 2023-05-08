package edu.chitkara;

public class StringProgram {

	public static void main(String[] args) {

		String var = "hello world";
		char[] charArray = var.toCharArray();
		char[] ar1 = new char[charArray.length];

		int p = 0;

		for (int x = ar1.length-1; x >= 0; x--) {
			ar1[x] = charArray[p++];
		}
		String g = new String(ar1);
		System.out.println(g);
	}
}
