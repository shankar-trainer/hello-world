package com.capgemini.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamPrg2 {

	public static void main(String[] args) throws IOException {
		// append argument
		FileOutputStream outputStream = new FileOutputStream("c:/welcome/test1.txt", true);
		Scanner sc = new Scanner(System.in);
		String s = "n";
		String s1 = null;

		int x = 0;
		while (s.equals("n")) {

			System.out.println("Enter line");
			if (x >= 1)
				sc.nextLine();
			x++;

			//outputStream.write((sc.nextLine().concat("\n")).getBytes());
			s1=sc.nextLine().concat("\n");
			outputStream.write(s1.getBytes());

			System.out.println("exit y\\n");
			s = sc.next();
		}
		sc.close();
		outputStream.close();

	}
}
