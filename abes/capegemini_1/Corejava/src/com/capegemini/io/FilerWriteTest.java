package com.capegemini.io;

import java.io.FileWriter;
import java.io.IOException;

public class FilerWriteTest {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("welcome.txt");
		
		fileWriter.write("hello world".toCharArray());
		fileWriter.write('\n');
		fileWriter.write('&');
		fileWriter.write('\n');
		fileWriter.write("end of file".toCharArray());
		
		fileWriter.close();
	}
}
