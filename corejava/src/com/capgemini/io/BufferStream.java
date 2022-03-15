package com.capgemini.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/Account.java");
		//FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse_capg_feb22_gcp\\corejava\\src\\Account.java");
		BufferedInputStream stream=new BufferedInputStream(fis);
		int x=0;
		
		while((x=stream.read())!=-1) 
		//while((x=fis.read())!=-1) 
		{
			System.out.print((char)x);
		}
		stream.close();
		fis.close();
	}
}
