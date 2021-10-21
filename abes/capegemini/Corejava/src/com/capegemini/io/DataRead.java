package com.capegemini.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataRead {

	public static void main(String[] args) throws IOException {
		DataInputStream inputStream = new DataInputStream(new FileInputStream(
				"emp.dat"));

		int id = inputStream.readInt();
		String name = inputStream.readUTF();
		float salary = inputStream.readFloat();

		System.out.printf("id is %d\nname is %s\nsalary is %f",
				id, name,salary);

	}
}
