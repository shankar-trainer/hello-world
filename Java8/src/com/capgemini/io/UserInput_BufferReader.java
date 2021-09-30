package com.capgemini.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput_BufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter roll");
		String s = br.readLine();
		int roll = Integer.parseInt(s);

		System.out.println("Enter Name");
		String name = br.readLine();

		System.out.println("Enter Marks1");
		float m1 = Float.parseFloat(br.readLine());

		System.out.println("Enter Marks2");
		float m2 = Float.parseFloat(br.readLine());

		float total = m1 + m2;
		float percentage = total / 2;

		System.out.println("roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("marks1 is " + m1);
		System.out.println("marks2 is " + m2);
		System.out.println("total marks is " + total);
		System.out.println("percentage of  marks is " + percentage);
		br.close();

	}
}
