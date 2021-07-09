package org.cognizant.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileExample5 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String ch = "";

		FileOutputStream outputStream = new FileOutputStream("C:\\welcome\\hello3.txt");

		while (!ch.equals("exit1")) {
			System.out.println("enter string ");
			ch =sc.nextLine();

			outputStream.write(ch.getBytes());
			System.out.println("enter exit1 to terminate ");
			ch = sc.next();
		}
		sc.close();

		outputStream.close();

	}
}
