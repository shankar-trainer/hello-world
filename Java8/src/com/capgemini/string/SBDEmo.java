package com.capgemini.string;

public class SBDEmo {

	
	public static void main(String[] args) {
		String s1="hello";
		s1.concat(" world");
		// String is immutable 
		System.out.println(s1);
		
		//StringBuffer sb="hello";  // error  becoz of string literal
		StringBuffer sb=new StringBuffer("hello");
         //StringBuffer is  mutable 		
		sb.append("world to java");
		System.out.println(sb);
		
		sb.insert(3,"....hi....");
		
		System.out.println(sb);
		
		sb.delete(3,6);
		System.out.println(sb);
       		
		
		StringBuffer sb1=new StringBuffer("welcome");
        sb1.reverse();
		System.out.println(sb1);
		
		
	
		
		
	}
}
