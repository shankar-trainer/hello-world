package com.capgemini.string;

public class StringPrg7 {

	public static void main(String[] args) {

		String city1 = "delhi";
		char c = 'h';

		System.out.println(c + "  " + (int) c);

		System.out.println(city1.charAt(3) + "  code point  " + city1.codePointAt(3));

		String city2 = "delhi";

		System.out.println(city1.compareTo(city2));
		System.out.println(city1.compareTo("delhi"));
		System.out.println(city1.compareTo("celhi")); // city1 -- d -- city2 -- c
		System.out.println(city1.compareTo("dflhi")); // city1 -- e -- city2 -- d
		System.out.println(city1.compareTo("delhk")); // city1 -- e -- city2 -- d

		if (city1.compareTo(city2) == 0)
			System.out.println(city1 + " is equal to " + city2);

		char ch[] = city2.toCharArray();
		
		System.out.println(ch[0]+1);
	
		char ar1[]= new char[city1.length()];
		
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=(char)(city1.charAt(i)+1);
		}
		
	    System.out.println(new String(ar1));	
	    //delhi 
	    //efmij
		
	}
}
