package com.montran.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterPrg1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter=new FileWriter("c:/welcome/abc.txt",true);
		
		Scanner scanner=new Scanner(System.in);
		
		fileWriter.write("hello world\n");
		
		String s="";
		System.out.println("type @&$ to exit ");

		while(!s.contentEquals("@&$")) {
			fileWriter.write("\n".concat(s));
			System.out.println("Enter lines ");
			s=scanner.nextLine();
		}
		
		scanner.close();
		fileWriter.close();
		
		FileReader reader=new FileReader("c:/welcome/abc.txt");
		int x;
		
		while((x=reader.read())!=-1)
			System.out.print((char)x);
		reader.close();
	}
}
