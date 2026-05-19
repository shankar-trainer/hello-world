package com.montran.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CosnoleProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int roll;
		String name, subject1, subject2;

		float m1, m2;
		float total, avg;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter roll");
		roll = Integer.parseInt(bufferedReader.readLine());

		System.out.println("Enter name");
		name = bufferedReader.readLine();

		System.out.println("Enter subject1");
		subject1 = bufferedReader.readLine();

		System.out.println("Enter subject2");
		subject2 = bufferedReader.readLine();

		System.out.println("Enter marks1");
		m1 = Float.parseFloat(bufferedReader.readLine());

		System.out.println("Enter marks2");
		m2 = Float.parseFloat(bufferedReader.readLine());

		total = m1 + m2;
		avg = total / 2;

		System.out.println("Roll is " + roll);
		System.out.println("Name is " + name);
		System.out.println("Subject1 is " + subject1);
		System.out.println("Subject2 " + subject2);
		System.out.println("Marks1 is " + m1);
		System.out.println("Marks2 is " + m2);
		System.out.println("Total marks is " + total);
		System.out.println("Average  marks is " + avg);
	}
}
