package com.capegemini.io;

import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("sst.txt");
		int p=0;
		while((p=fileReader.read())!=-1) {
			System.out.print((char)p);
		}
	}
}
