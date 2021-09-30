package com.capgemini.string;

public class StringPrg6 {

	public static void main(String[] args) {

		String s1 = "learning java is easy";

		String s2 = s1.replace('a', 'z');// replace the char with new char
		System.out.println(s2);

		String s3 = s1.replaceAll("java", "python");// replace the required words with other words
		System.out.println(s3);

		System.out.println(s1.contains("java"));
		System.out.println(s1.contains("python"));

		System.out.println(s1.charAt(5));
		System.out.println(s1.codePointAt(5));

		float salary = 23456.778878f;

		String newsal = String.format("%.2f", salary);
		System.out.println(newsal);


		 String email="capg_ramkumar@capgemini.com";
		 
		 if(email.startsWith("capg"))
		 {
			 if(email.endsWith(".com")) {
					if (email.indexOf("@") >= 0) {
						  System.out.println("email is valid");
				  } 
				  else 
					  System.out.println("invalid email does not have @ sign ");
			 }
			  else 
				  System.out.println("invalid email does not ends with .com ");
		 }
		  else 
			  System.out.println("invalid email does not starts with capg ");
	 
	
	}
}
