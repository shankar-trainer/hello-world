package com.coforge.string;

import java.util.Scanner;

public class StringPrg2 {

	public static void main(String[] args) {
		System.out.println("hello"=="hello");
		// both will refers same  object in string pool
		System.out.println("hello"==new String("hello"));
		// both will refers different  object first in string pool, 
		  //2nd outside string pool
		
		System.out.println("hello".equals(new String("hello")));
		
		//using scanner user input will create object using new String()
		
		System.out.println("enter name");
		String name="ram";
		String name1=new Scanner(System.in).next();
		
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
	}
}
