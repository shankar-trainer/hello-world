package com.capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FISExample {

	public static void main(String[] args) throws IOException {

		// FileInputStream fileInputStream=new
		// FileInputStream("C:\\welcome\\test2.txt");

		File file = new File("C:\\welcome\\test2.txt");
		FileInputStream fileInputStream = new FileInputStream(file);

		 // fileInputStream.skip(20);
		
		int x = fileInputStream.read();

		
		while (x != -1) {
			System.out.print((char) x);
			x = fileInputStream.read();
		}
		fileInputStream.close();
	}
}
