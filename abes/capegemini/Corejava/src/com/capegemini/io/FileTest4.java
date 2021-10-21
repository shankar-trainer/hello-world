package com.capegemini.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest4 {

	public static void main(String[] args) throws IOException {
		File file = new File("c:/corejava/capegemini/hello1.txt");

		FileOutputStream outputStream=null;
		try {
			outputStream = new FileOutputStream(file,true);
			outputStream.write("greeting world\n".getBytes());
		  
			

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}

		finally {
			outputStream.close();
		}

	}
}
