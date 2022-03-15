package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamPrg3 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream stream=new FileInputStream("c:/welcome/test1.txt");
 //  stream.read();     // read byte by byte 		
		             //end of file is -1 
		
		  int b1 = stream.read();
		  
		  while(b1!=-1) {
			System.out.print((char)b1);
			b1 = stream.read();
		  }
		
		stream.close();
	}
}
