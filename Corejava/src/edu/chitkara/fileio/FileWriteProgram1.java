package edu.chitkara.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteProgram1 {

	public static void main(String[] args) {
		
		try {
			FileWriter writer=new //FileWriter("c:\\chitkara\\welcome1.txt");
			 FileWriter(new File("c:\\chitkara\\welcome1.txt"),true);
			writer.write(new char[] {'a','b','c','\n'});
			writer.write("hello world\n");
			writer.write(65);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
