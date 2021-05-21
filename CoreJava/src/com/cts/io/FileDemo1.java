package com.cts.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
//		FileOutputStream stream=new FileOutputStream("C:\\hello\\hello1.txt");
		
		FileOutputStream stream=new FileOutputStream("C:/hello/hello1.txt",true);
		
		stream.write("\nhello world".getBytes());
		
		System.out.println("file is written");
		
		stream.close();
	}
}
