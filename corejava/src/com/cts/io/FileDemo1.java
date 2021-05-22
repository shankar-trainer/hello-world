package com.cts.io;

import java.io.FileReader;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:/hello/welcome2.txt");

			int x = 0;

			while ((x = reader.read()) != -1) {
				System.out.print((char)x);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
