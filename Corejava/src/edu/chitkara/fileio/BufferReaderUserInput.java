package edu.chitkara.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderUserInput {

	public static void main(String[] args) throws IOException {

		// Scanner scanner=new Scanner(System.in);
		// int x=scanner.nextInt();
		// System.out.println(x%2==0);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no");
		String s = reader.readLine();
		int x = Integer.parseInt(s);
		System.out.println(x % 2 == 0);

	}
}
