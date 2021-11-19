package com.capgemini.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.txt");
		fw.write("learning java is useful");
		fw.write("\nwe  will learn sql  too ");
		fw.write("\nwe  will learn sql  using oracle ");

		fw.close();

		FileReader reader = new FileReader("abc.txt");

		int x;
		while ((x = reader.read()) != -1) {
			System.out.print((char)x);
		}
		reader.close();
	}
}
