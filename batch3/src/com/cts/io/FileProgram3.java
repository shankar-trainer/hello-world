package com.cts.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String ch = "";
		FileOutputStream outputStream = null;
		System.out.println("enter exit1 to exit");
		try {
			while (!ch.equals("exit1")) {
				outputStream = new FileOutputStream("c:\\hello\\abc.txt", true);
				System.out.println("Enter string ");
				ch = sc.nextLine();
				outputStream.write(ch.getBytes());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			sc.close();
			outputStream.close();
		}

	}
}
