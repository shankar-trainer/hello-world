package com.montran.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileOutputStream=new FileOutputStream("C:/welcome/hello.txt",true);
				//("C:\\welcome\\hello.txt"); //window path style 
		
		fileOutputStream.write("hello world\n".getBytes());
		
		fileOutputStream.close();
		
	}
}
