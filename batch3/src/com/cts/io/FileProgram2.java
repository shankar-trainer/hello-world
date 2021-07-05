package com.cts.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram2 {

	public static void main(String[] args) throws IOException {
//		FileOutputStream outputStream=new FileOutputStream("c:\\hello\\welcome1.txt");
		FileOutputStream outputStream=new FileOutputStream("c:/hello/welcome1.txt",true);
		
		outputStream.write("hello".concat("\n").getBytes());
		
		outputStream.close();
	}
}
