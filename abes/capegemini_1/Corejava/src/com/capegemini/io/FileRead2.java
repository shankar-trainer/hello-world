package com.capegemini.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("student.csv");
		
		BufferedReader reader=new BufferedReader(fileReader);
		
		int p=0;
		String s="";
		//while((p=fileReader.read())!=-1) 
		while((s=reader.readLine())!=null)
		{
			System.out.println(s);
		}
	}
}
