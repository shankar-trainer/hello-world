package com.cts.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("c:\\hello\\FileProgram1.java");
		int x;
		
		while((x=fileReader.read())!=-1) {
			System.out.print((char)x);
		}
		fileReader.close();
	}
}
