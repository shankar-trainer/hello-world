package com.montran.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample7 {

	public static void main(String[] args) throws IOException {
//C:\welcome\img1.jpg
		FileInputStream inputStream = new FileInputStream("C:\\welcome\\img1.jpg");
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\welcome\\img2.jpg");
		int x = inputStream.read();

		while (x != -1) {
			fileOutputStream.write(x);
			x = inputStream.read();
		}

		inputStream.close();
		fileOutputStream.close();
	}
}
