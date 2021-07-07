package org.cognizant.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRConsole {

	public static void main(String[] args) throws IOException {
		int x, y, z;
		String s;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st No ");
		s = reader.readLine();
		x = Integer.parseInt(s);

		System.out.println("Enter 2nd  No ");

		y = Integer.parseInt(reader.readLine());
		z = x + y;
		System.out.printf("\nsum of %d and %d is %d", x, y, z);
	}
}
