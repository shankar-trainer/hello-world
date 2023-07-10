package com.coforge.string;

public class StringPrg6 {

	public static void main(String[] args) {
		
		String var="malayalam";
		
		char[] charArray = var.toCharArray();
		
		char ar[]=new char[charArray.length];
		int x=0;
		for (int i = charArray.length-1; i>=0 ; i--) {
			ar[x]=charArray[i];
			x++;
		}
		
		String reverse=new String(ar);
		System.out.println(reverse);
		System.out.println("is palindrome "+var.equals(reverse));
	}
}
