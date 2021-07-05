package com.cts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream=new FileOutputStream("c:\\hello\\greeting.txt");
		FileInputStream fileInputStream=new FileInputStream("c:/hello/FileProgram1.java");
		int x;
		
		while((x=fileInputStream.read())!=-1) {
		   fileOutputStream.write((char)x);	
		}
		fileInputStream.close();
		fileOutputStream.close();
	}
}
