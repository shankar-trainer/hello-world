package edu.chitkara.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CSVRead {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/chitkara/student.csv");
			int x;

			while ((x = fileInputStream.read()) != -1) {
				if ((char) x == ',')
					System.out.print(" ");
				else
					System.out.print((char) x);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
