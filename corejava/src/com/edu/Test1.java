package com.edu;

public class Test1 {

	final float cost=8989;
	final String country;
	    // blank final 
	static final String capital="delhi";
	
	public Test1() {
		country="india";
	}
	
	
	public static void main(String[] args) {
		final int x=100;
		
		//x=778;
		System.out.println(Test1.capital);
	}
}
