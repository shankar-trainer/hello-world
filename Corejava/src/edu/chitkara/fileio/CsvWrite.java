package edu.chitkara.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CsvWrite {

	public static void main(String[] args) {

		try {
			FileOutputStream stream = new FileOutputStream
					("c:/chitkara/student.csv");

			stream.write("roll,".getBytes());
			stream.write("name,".getBytes());
			stream.write("subject,\n".getBytes());

			stream.write("10001,".getBytes());
			stream.write("shyam kumar,".getBytes());
			stream.write("physics".getBytes());
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
