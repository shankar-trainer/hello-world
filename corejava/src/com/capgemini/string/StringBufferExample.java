package com.capgemini.string;

public class StringBufferExample {

	public static void main(String[] args) {
		String s1="abc";
		s1.concat( "def");
		System.out.println(s1);
		//StringBuffer sb="hello";// StringBuffer will not accept string literal
		
		StringBuffer sb=new StringBuffer("hello"); //
		 // StringBuffer is mutable in nature 
		sb.append(" world");
		
		System.out.println(sb);
		System.out.println("reverse "+sb.reverse());
		System.out.println("reverse "+sb);
		
		StringBuffer sb1=new StringBuffer("hello"); //
		
		sb1.insert(3, "america ");
		
		System.out.println(sb1);
		
		sb1.delete(3, 7);
		System.out.println(sb1);
		
	     String var="we are learning java. java is most used programming language";
	     System.out.println(var.replace('a', 'z'));
	     System.out.println(var.replaceAll("java", "nodejs"));
	     System.out.println(var);

	     sb1.replace(0, 5, "welcome");
	     System.out.println(sb1);
	 
	}
}
