package edu.chitkara.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteProgram1 {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/chitkara/hello.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("c:/chitkara/welcome.txt");

			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

			int x;

			while ((x = bufferedInputStream.read()) != -1) {
				bufferedOutputStream.write(x);
			}

			fileInputStream.close();
			fileOutputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
