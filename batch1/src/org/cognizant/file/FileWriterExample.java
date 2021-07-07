package org.cognizant.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("c:\\welcome\\mydata.txt");
		
		fileWriter.write("hello world\n");
		fileWriter.write("hello world\n");
		fileWriter.write("hello world\n");
		
		fileWriter.close();
		
	}
}
