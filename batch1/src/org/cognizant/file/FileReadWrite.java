package org.cognizant.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\welcome\\hello1.txt");
		char ar[] = new char[100];

		reader.skip(10);
		
		int y = reader.read(ar);
		System.out.println(y + " no of character is present");

		for (char c : ar) {
			System.out.print(c);
		}
	}
}
