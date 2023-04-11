package com.audintel.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram3 {

	public static void main(String[] args) {

	//  FileOutputStream outputStream=new FileOutputStream(new File("c:\\welcome\\hello.txt"));//window style path
	  
		try {
	//		FileOutputStream outputStream=new FileOutputStream(new File("c:/welcome/hello.txt"));
	//		FileOutputStream outputStream=new FileOutputStream("c:/welcome/hello1",true);// 2nd arg for append as true
			FileOutputStream outputStream=new FileOutputStream("hello1",true);// 2nd arg for append as true
			outputStream.write("hello world\n".getBytes());
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	  
	}

}
