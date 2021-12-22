package com.cognizant.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream outputStream=new FileOutputStream("C:\\welcome\\hello.txt",true);
		outputStream.write("\nhello world".getBytes());
		outputStream.write("\nhello world".getBytes());
		outputStream.write("\nhello world".getBytes());
		outputStream.write("\nhello world".getBytes());
		outputStream.write("\nhello world".getBytes());
		
		
		outputStream.close();
	}
}
