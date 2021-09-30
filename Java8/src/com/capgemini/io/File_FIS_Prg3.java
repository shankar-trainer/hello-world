package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_FIS_Prg3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream
		// ("C:\\capegemini3\\Java8\\src\\com\\capgemini\\io\\File_FIS_Prg1.java");//
		// window style \\
		("C:/capegemini3/Java8/src/com/capgemini/io/File_FIS_Prg1.java");// unix style path /

		
		System.out.println("available chars are  "+fis.available());
		int x;
		fis.skip(50);
		System.out.println("available chars are  "+fis.available());
		while ((x = fis.read()) != -1) {
			System.out.print((char) x);
		}

	}
}
