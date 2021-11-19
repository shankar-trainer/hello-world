package com.capgemini.io;

import java.io.File;
import java.io.IOException;

public class FileProgram2 {

	public static void main(String[] args) throws IOException {
		// File file=new File("C:\\welcome"); // window path

		File file = new File("C:/welcome/assignment");// unix path

		File file1 = new File("C:/welcome/hello.txt");// unix path
		System.out.println(file1.exists());

		if (file1.createNewFile())
			System.out.println("file is created");
		else
			System.out.println("file already exists");

		file.mkdir();
		
	}
}
