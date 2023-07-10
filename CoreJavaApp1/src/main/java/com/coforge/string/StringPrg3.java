package com.coforge.string;

public class StringPrg3 {

	public static void main(String[] args) {
		
		String var1="we are learning java";
		
		System.out.println(var1.length());
		System.out.println(var1.concat(" and will learn spring also"));
		
		char c1=var1.charAt(0);
		System.out.println(c1);
		
		for(int x=0;x<var1.length();x++)
			System.out.print(var1.charAt(x)+", ");
		
		System.out.println();
		String[] split = var1.split(" ");
		for(String s:split)
			System.out.println(s);
		
		String var2="hello-how&are@you.i am#fine";
		
		for(String s1:var2.split("-|&|@|#| "))
			System.out.println(s1);
		
	}
}
