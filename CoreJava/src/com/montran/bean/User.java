package com.montran.bean;

class Person{
	
}
public class User  extends Person{

	public static void main(String[] args) {
		
		User user=new User();
		System.out.println(user instanceof User);
		System.out.println(user instanceof Person);
		System.out.println(user instanceof Object);
		
		// primitive casting 
		
		int x=10000;
		float f1=x;
		int s=(int) f1;
		
		// reference casting 
		
		Integer k=1000;
		//Float l=k;
		
		Float s1=8899898.00f;
		///k=s1;
		
		
		Number x11=k;
		Number x12=s1;
		
		
		
		
	}
}
