package com.montran.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample5 {

	public static void main(String[] args) throws IOException {
//C:\welcome\img1.jpg
		FileInputStream inputStream = new FileInputStream("c:/welcome/test1.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("test2.txt");
		int x = inputStream.read();

		while (x != -1) {
			fileOutputStream.write(x);
			x = inputStream.read();
		}

		inputStream.close();
		fileOutputStream.close();
	}
}
