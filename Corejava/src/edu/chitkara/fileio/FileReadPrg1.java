package edu.chitkara.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadPrg1 {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("abc.txt");
			int r;

			while ((r = reader.read()) != -1) {
				System.out.print((char) r);
			}
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
