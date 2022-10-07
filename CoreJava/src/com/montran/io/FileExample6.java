package com.montran.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample6 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  inputStream=new FileInputStream("c:/welcome/test1.txt");
		
		BufferedInputStream stream=new BufferedInputStream(inputStream);
		
		int x=stream.read();
		
		while(x!=-1) {
			System.out.print((char)x);
			x=stream.read();
		}
		
		inputStream.close();
	}
}
