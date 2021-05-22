package com.cts.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
		
		try {
			FileWriter writer=new FileWriter("c:/hello/abc.txt",true);
			writer.write("hello \n");
			
			writer.close();
			
		}
		catch (IOException e) {
		}
		
	}
}
