package com.capegemini.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int roll;
		String name;
		float m1, m2, total;

		System.out.println("Enter roll");
		roll = Integer.parseInt(reader.readLine());
		System.out.println("Enter name");
		name = reader.readLine();

		System.out.println("Enter Marks1");
		m1 = Float.parseFloat(reader.readLine());

		System.out.println("Enter Marks2");
		m2 = Float.parseFloat(reader.readLine());
		
		total=m1+m2;
		System.out.println("Name is "+name);
		System.out.println("roll is "+roll);
		System.out.println("marks1 is "+m1);
		System.out.println("marks2 is "+m2);
		System.out.println("total is "+total);
	}
}
