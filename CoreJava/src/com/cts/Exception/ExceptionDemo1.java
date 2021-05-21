package com.cts.Exception;

class Animal{
	
}
class Dog extends Animal{
	
}

public class ExceptionDemo1 {

	public static void main(String[] args) {

		Dog dog1=new Dog();
		Animal animal=new Animal();
		
		//animal=dog1;
		 dog1=(Dog) animal;
		 //java.lang.ClassCastException
			
		// int x=10/0;//java.lang.ArithmeticException
		int x = 10 / 2;// java.lang.ArithmeticException
		System.out.println(x);

		int ar[] = { 11, 22, 33, 4, 55 };

		// System.out.println(ar[5]);
		System.out.println(ar[4]);
		// java.lang.ArrayIndexOutOfBoundsException

		String s = null;
		// java.lang.NullPointerException
		// System.out.println(s.length());

		String p = "hello";

		// System.out.println(p.charAt(5));

		// java.lang.StringIndexOutOfBoundsException
		//String var = "123abc";
		String var = "123";

		int g = Integer.parseInt(var);// java.lang.NumberFormatException
		System.out.println(g);

		
		
		
	}
}
