package org.cognizant.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream  outputStream=new FileOutputStream("C:\\welcome\\test1.txt");
		
		outputStream.write("hello world".getBytes());
		System.out.println("data written to the file");
		
		outputStream.close();
		
		
	}
}
