package com.capgemini.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferFISProgram {

	public static void main(String[] args) throws IOException {

		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("c:\\welcome\\test3.txt"));

		int x=0;

		while ((x = bufferedInputStream.read()) != -1) 
			System.out.print((char) x);
		
		bufferedInputStream.close();
	}

}
