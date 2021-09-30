package com.capgemini.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class File_FIS_Buffer_Prg2 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:/capegemini3/Java8/src/com/capgemini/io/File_FIS_Prg1.java");// unix
		BufferedInputStream bis = new BufferedInputStream(fis); 
		int x;
		while ((x = bis.read()) != -1) {
			System.out.print((char) x);
		}

		bis.close();
		fis.close();
	}
}
