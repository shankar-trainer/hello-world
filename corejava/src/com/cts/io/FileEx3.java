package com.cts.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileEx3 {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\hello\\welcome2.txt");

			int x = 0;
			while ((x = fileInputStream.read()) != -1) {

				System.out.print((char) x);
			}

			fileInputStream.close();
		}

		catch (IOException e) {
		}

	}
}
