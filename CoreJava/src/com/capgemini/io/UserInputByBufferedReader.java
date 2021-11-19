package com.capgemini.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputByBufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		String name=bufferedReader.readLine();
		
		System.out.println("Enter no1");
		int x1=Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter no2");
		int x2=Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("name is "+name);
		System.out.println("no1 is "+x1);
		System.out.println("no2 is "+x2);
		System.out.println("sum is "+(x1+x2));
		
		bufferedReader.close();
		
	}
}
