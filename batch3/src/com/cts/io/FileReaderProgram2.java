package com.cts.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderProgram2 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("c:\\hello\\FileProgram1.java");
		char ar[] = new char[40];

		fileReader.read(ar);

		System.out.println(new String(ar));

		FileWriter writer = new FileWriter("c:/hello/mytadat2.txt", true);

		writer.write("hello world\n");
		writer.write("hello world\n");
		writer.write("hello world\n");
		writer.write("hello world\n");
		writer.write("hello world\n");
		writer.close();
		fileReader.close();
	}
}
