package org.cognizant.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample4 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("C:\\welcome\\hello.txt");
      FileOutputStream outputStream=new FileOutputStream("C:\\welcome\\hello1.txt")	;	
		int c=fileInputStream.read();
		
		while(c!=-1) {
			outputStream.write(c);
			
			c=fileInputStream.read();
		}

		outputStream.close();
		fileInputStream.close();
		
	}
}
