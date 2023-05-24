package edu.chitkara.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilePrg1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream stream=new FileOutputStream
				("c:\\chitkara\\test1.txt",true);
		
		stream.write("hello world to java\n".getBytes());
		stream.close();
		
	}
}
