package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_FIS_Prg5 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/capegemini3/Java8/src/com/capgemini/io/File_FIS_Prg1.java");

		FileOutputStream fos = new FileOutputStream("c:\\welcome1\\fileprg1.java");

		int x;

		while ((x = fis.read()) != -1) {
			fos.write(x);
		}

		fis.close();
		fos.close();
		System.out.println("File copy program");
	}
}
