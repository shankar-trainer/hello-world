package com.capgemini.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamPrg4 {

	public static void main(String[] args) throws IOException {

		FileInputStream stream = new FileInputStream("c:/welcome/test1.txt");
   byte b1[]=new byte[100];
   
   System.out.println("total bytes "+stream.available());
   stream.skip(20);
   System.out.println("total bytes "+stream.available());
   
   stream.read(b1);
   for(byte b:b1)
	   System.out.print((char)b);
		
		stream.close();
	}
}
