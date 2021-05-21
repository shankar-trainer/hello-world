package com.cts.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileprogrambyWriter {

	public static void main(String[] args) {
	
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("c:/hello/file1.txt");
			fileWriter.write("hello world");
			
			fileWriter.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
