package com.cts.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		BufferedInputStream stream = null;
		try {
			inputStream = new FileInputStream("C:\\hello\\test1.txt");
			stream = new BufferedInputStream(inputStream);
			byte b[] = new byte[100];

			stream.read(b);

			for (byte b1 : b) {
				System.out.print((char) b1);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			stream.close();
			inputStream.close();
		}
	}
}
