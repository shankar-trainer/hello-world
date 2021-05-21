package com.cts.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileData2 {
	public static void main(String[] args) throws IOException {

		DataInputStream dataInputStream = new DataInputStream(new FileInputStream("emp.dat"));

		System.out.println(dataInputStream.readInt());
		System.out.println(dataInputStream.readUTF());
		System.out.println(dataInputStream.readFloat());

		dataInputStream.close();

	}
}
