package com.cts.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram6 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream=new FileOutputStream("c:\\hello\\greeting2.txt");
		FileInputStream fileInputStream=new FileInputStream("c:/hello/FileProgram1.java");
		int x;
		
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
		
		
		while((x=bufferedInputStream.read())!=-1) {
		   bufferedOutputStream.write((char)x);	
		}
		
		bufferedInputStream.close();
		bufferedOutputStream.close();
		
		fileInputStream.close();
		fileOutputStream.close();
	}
}
