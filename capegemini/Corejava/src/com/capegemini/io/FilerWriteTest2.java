package com.capegemini.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilerWriteTest2 {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fileWriter=new FileWriter("welcome1.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		
		bufferedWriter.write("hello world to the java",0, 14);
		
		bufferedWriter.write('\n');
		bufferedWriter.write('&');
		bufferedWriter.write('\n');
		bufferedWriter.write("end of file".toCharArray());
		bufferedWriter.close();
		fileWriter.close();
	}
}
