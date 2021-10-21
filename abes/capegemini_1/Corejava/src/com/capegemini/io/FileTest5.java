package com.capegemini.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileTest5 {

	public static void main(String[] args) throws IOException {
		File file = new File("c:/corejava/capegemini/hello2.txt");

		FileOutputStream outputStream=null;
		Scanner scanner=new Scanner(System.in);
		
		try {
			outputStream = new FileOutputStream(file);
			String s="\n";
			while(!s.equals("exit123")){
				System.out.println("Enter message ");
				s=scanner.nextLine();
				outputStream.write(s.concat("\n").getBytes());
				System.out.println("Enter exit123 to exit");
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		finally {
			scanner.close();
			outputStream.close();
		}
	}
}
