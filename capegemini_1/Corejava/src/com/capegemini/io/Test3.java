package com.capegemini.io;

public class Test3 {

	public static void main(String[] args) {
		// string begins with a capital letter ends with . or ! or ?
		
		String pattern="[A-Z].*[\\.!?]";
		
		System.out.println("Hello?".matches(pattern));
		
		// string must contain hello 
		
		System.out.println("world  hel  to java ".matches(".*hello.*"));
		
	}
}
