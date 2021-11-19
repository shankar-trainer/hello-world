package com.capgemini.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSExample1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream=new FileOutputStream("C:\\welcome\\test.txt",true);
		
		outputStream.write((int)'a');
		
		outputStream.write("\nhello world".getBytes());
		
		outputStream.close();
	}
}
