package com.nec.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamPrg2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream outputStream = new FileOutputStream("C:\\welcome\\hello2.txt", true);
		Scanner sc = new Scanner(System.in);

		String s = "n";
		while (!s.equalsIgnoreCase("y")) {
			// outputStream.write("\nhello world".getBytes());
			System.out.println("Enter line ");
			sc.nextLine();
			
			outputStream.write(sc.nextLine().concat("\n").getBytes());
			System.out.println("Exit y\\n ");
			s = sc.next();

		}
	}
}
