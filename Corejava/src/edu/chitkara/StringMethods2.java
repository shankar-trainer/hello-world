package edu.chitkara;

public class StringMethods2 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3="Hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String mail="stud_ramkumar@gmail.com";
		
		System.out.println(mail.startsWith("stud"));
		System.out.println(mail.endsWith(".com"));
		
		
	}
}
