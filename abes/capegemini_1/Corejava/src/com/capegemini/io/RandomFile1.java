package com.capegemini.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile1 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("hello2.txt", "rw");

		file.write("Employee Data\n".getBytes());

		file.writeInt(3333);
		file.writeUTF("ram kumar");
		file.writeFloat(34556.67f);

		file.seek(0);
		System.out.println(file.readLine());
		System.out.println("Id is " + file.readInt());
		System.out.println("name is " + file.readUTF());
		System.out.println("salary is " + file.readFloat());
		
		file.seek(0);
		
		file.write("Pune Location\n".getBytes());

		
	}
}
