package com.cts.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo3 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter name ");
			String name=reader.readLine();
			
			System.out.println("Enter age ");
			
			int age =Integer.parseInt(reader.readLine());
			
			System.out.println("name "+name);
			System.out.println("age "+age);
			
			
		}
		catch (IOException e) {
		}
		
	}
}
