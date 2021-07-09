package org.cognizant.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=new FileInputStream("C:\\welcome\\hello.txt");
		
		int c=fileInputStream.read();
		
		while(c!=-1) {
			System.out.print((char)c);
			c=fileInputStream.read();
		}
		fileInputStream.close();
		
	}
}
