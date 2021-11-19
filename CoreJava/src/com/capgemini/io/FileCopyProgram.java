package com.capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
// File Copy Program
	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream("C:\\welcome\\test2.txt");

		FileOutputStream outputStream = new FileOutputStream("C:\\welcome\\test3.txt");

		int x = fileInputStream.read();

		while (x != -1) {
			outputStream.write(x);
			x = fileInputStream.read();
		}
		outputStream.close();
		fileInputStream.close();

	}
}
