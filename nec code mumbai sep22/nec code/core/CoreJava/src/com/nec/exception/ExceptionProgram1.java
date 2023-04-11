package com.nec.exception;

public class ExceptionProgram1 {

	public static void main(String[] args) {
		
		System.out.println(1/0.0);
		
		System.out.println(1.0/0.0);
		
//		System.out.println(1/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero

int ar1[]= {1,2,3,4,5};

//System.out.println("my lucky no is "+ar1[5]);//Index 5 out of bounds for length 5

String name=null;

//System.out.println(name.length());// Cannot invoke "String.length()" because "name" is null


String city="mumbai";

//System.out.println(city+" 6th char is   "+city.charAt(6));//StringIndexOutOfBoundsException:


String no1="1001a";

int p=Integer.parseInt(no1);//NumberFormatException



	}
}
