package com.cognizant.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter name");
		String name=reader.readLine();
		
		System.out.println("Enter Id");
		int id =Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Salary");
		float salary =Float.parseFloat(reader.readLine());
		
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		
	}
}
