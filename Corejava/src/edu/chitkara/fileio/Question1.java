package edu.chitkara.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		try {
			FileOutputStream stream=new FileOutputStream
					("c:\\chitkara\\test2.txt",true);
			Scanner scanner=new Scanner(System.in);
			int c=1;
			String s;
			while(c<=5) {
				System.out.println("Enter Line  ");
				s=scanner.nextLine();
			     try {
					stream.write(s.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
				c++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
