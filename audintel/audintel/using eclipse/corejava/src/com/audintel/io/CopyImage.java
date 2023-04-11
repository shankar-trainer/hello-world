package com.audintel.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void writeImage(String file) throws IOException {

		FileInputStream inputStream = new FileInputStream(file);
		byte b[] = new byte[80 * 1024];
		System.out.println("no of bytes read " + inputStream.read(b));

		FileOutputStream stream = new FileOutputStream("c:\\welcome\\myimage.jpg");
		stream.write(b);
		inputStream.close();
		stream.close();
	}

	public static void main(String[] args) {

		String file = "C:\\Users\\shankar\\Pictures\\img1.jpg";

		try {
			writeImage(file);
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
