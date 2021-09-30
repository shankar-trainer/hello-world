package com.capgemini.io;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer_Prg1 {

	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("c:/welcome1/prg1.txt",true);
		//writer.write('a');
		writer.write(new char[] {'\n','h','e','l','l','o','\n'});
		writer.write("hi i am fine here");		
		
		writer.close();
	}
}
