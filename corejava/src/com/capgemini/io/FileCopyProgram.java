package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream istream = new FileInputStream("c:/welcome/test1.txt");
		FileOutputStream ostream = new FileOutputStream("c:/welcome/test2.txt");

		int b1 = 0;

		while ((b1 = istream.read()) != -1) {
			ostream.write(b1);
		}

		istream.close();
		ostream.close();
		System.out.println("file copy program completed");
	}
}
