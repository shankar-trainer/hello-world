package com.capegemini.io;

public class RegTest1 {

	public static void main(String[] args) {
		
		String s="ram kumar";
		
		if(s.matches("[a-z]{3}\\s[a-z]{5}"))
			System.out.println("matches ");
		
		System.out.println("ram kumar".matches("[a-z]{3}\\s[a-z]{5}"));
		System.out.println("ramesh kumar".matches("[a-z]{3}\\s[a-z]{5}"));
		
		String roll="123a";
		  if(roll.matches("[0-9]+"))
			  System.out.println("roll is valid");
		  else
			  System.out.println("roll must be numeric");
		
		
	}
}
