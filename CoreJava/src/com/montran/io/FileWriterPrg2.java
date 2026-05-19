package com.montran.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterPrg2 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter=new FileWriter("c:/welcome/abc.txt",true);
		
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		
		Scanner scanner=new Scanner(System.in);
		
		
		String s="";
		System.out.println("type @&$ to exit ");

		while(!s.contentEquals("@&$")) {
			
			bufferedWriter.write("\n".concat(s));
			System.out.println("Enter lines ");
			s=scanner.nextLine();
		}
		
		scanner.close();
		fileWriter.close();
		
		FileReader reader=new FileReader("c:/welcome/abc.txt");
		 BufferedReader reader2=new BufferedReader(reader); 
		 String s1=null;
		
		while((s1=reader2.readLine())!=null)
			System.out.print(s1);
		reader.close();
	}
}
