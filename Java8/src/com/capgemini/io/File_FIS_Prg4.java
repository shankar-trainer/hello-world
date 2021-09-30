package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_FIS_Prg4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream
		// ("C:\\capegemini3\\Java8\\src\\com\\capgemini\\io\\File_FIS_Prg1.java");//
		// window style \\
		("C:/capegemini3/Java8/src/com/capgemini/io/File_FIS_Prg1.java");// unix style path /

		byte b[]=new byte[100];
		
		fis.read(b);
		
		for (byte c : b) {
			System.out.print((char)c);
		}
		
		fis.close();

	}
}
