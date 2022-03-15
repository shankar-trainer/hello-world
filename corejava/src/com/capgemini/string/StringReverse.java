package com.capgemini.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
	    String s=sc.nextLine();
	    System.out.println(s);
	    
	    char[] charArray = s.toCharArray();
	    char[] charArray1=new char[charArray.length];
	    int p=0;
	    
	    for (int i =charArray.length-1 ; i>=0 ; i--) {
			charArray1[p]=charArray[i];
			p++;
		}
		
	    String rev=new String(charArray1);
	    System.out.println(rev);
	    
	    if(s.equals(rev))
	    	System.out.println(s+" is palindrome");
	    else
	    	System.out.println(s+" is not palindrome");
	    
		sc.close();
	}
}
