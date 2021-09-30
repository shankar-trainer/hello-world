package com.capgemini.io;

import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {

		System.out.println("Enter a character");
		char read = (char)System.in.read();
		
		System.out.println("char entered is "+read);
		
	}
}
