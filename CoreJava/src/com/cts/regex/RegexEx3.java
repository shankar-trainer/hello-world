package com.cts.regex;

public class RegexEx3 {
	
	public static void main(String[] args) {
		
		System.out.println("abc".matches("abc"));
		System.out.println("xyz".matches("abc|xyz"));
		
		System.out.println("xyz".matches("x.z"));//.  single character 
		System.out.println("x1z".matches("x.z"));
		System.out.println("xAz".matches("x.z"));
		System.out.println("x$z".matches("x.z"));
		System.out.println("x%z".matches("x.z"));
	}
}
