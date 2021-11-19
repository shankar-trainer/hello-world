package com.capgemini.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterByBuffer {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.txt", true);
		BufferedWriter bufferedWriter = new BufferedWriter(fw);

		bufferedWriter.write("learning java is useful");
		bufferedWriter.write("\nwe  will learn sql  too ");
		bufferedWriter.write("\nwe  will learn sql  using oracle ");

		bufferedWriter.close();

		FileReader reader = new FileReader("abc.txt");

		BufferedReader bufferedReader = new BufferedReader(reader);

		String s;

		while ((s = bufferedReader.readLine()) != null) {
			System.out.println(s);
		}
		bufferedReader.close();
	}
}
