package org.cognizant.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=new FileInputStream("C:\\welcome\\hello.txt");
		BufferedInputStream stream=new BufferedInputStream(fileInputStream);
		
		int c=stream.read();
		
		while(c!=-1) {
			System.out.print((char)c);
			c=stream.read();
		}
		fileInputStream.close();
		stream.close();
	}
}
