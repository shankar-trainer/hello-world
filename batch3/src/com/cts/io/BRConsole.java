package com.cts.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRConsole {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter roll");
		int roll = Integer.parseInt(reader.readLine());
		
		System.out.println("enter name");
		String name = reader.readLine();

		System.out.println("enter marks1");
		float m1 = Float.parseFloat(reader.readLine());

		System.out.println("enter marks2");
		float m2 = Float.parseFloat(reader.readLine());

		float total = m1 + m2;
		float avg = total / 2;

		System.out.println("student data");
		System.out.println("roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("marks1  is " + m1);
		System.out.println("marks2  is " + m2);
		System.out.println("total marks  is " + total);
		System.out.println("average marks  is " + avg);

		reader.close();
	}
}
