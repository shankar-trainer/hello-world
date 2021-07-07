package org.cognizant.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("C:\\welcome\\hello1.txt");
			int read = reader.read();

			while (read != -1) {
				System.out.print((char) read);
				read = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
