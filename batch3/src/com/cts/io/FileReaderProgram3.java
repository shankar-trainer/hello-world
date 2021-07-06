package com.cts.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram3 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("c:\\hello\\FileProgram1.java");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		String s;
		
		while( (s=bufferedReader.readLine())!=null) {
			System.out.println(s);
		}
		bufferedReader.close();
		fileReader.close();
	}
}
