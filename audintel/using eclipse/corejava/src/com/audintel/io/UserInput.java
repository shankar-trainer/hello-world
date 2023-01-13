package com.audintel.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter id ");
			String s = reader.readLine();
			System.out.println("Enter Name ");
			String name = reader.readLine();

			System.out.println("Enter Slary ");
			String sal = reader.readLine();

			int id = Integer.parseInt(s);
			float salary = Float.parseFloat(sal);

			System.out.println("id is " + id);
			System.out.println("name is " + name);
			System.out.println("salary is " + salary);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
