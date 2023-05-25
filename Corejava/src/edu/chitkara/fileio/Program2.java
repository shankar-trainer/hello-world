package edu.chitkara.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		FileInputStream stream;
		try {
stream = new FileInputStream
("C:\\Users\\shankar\\eclipse-workspace_chitkara\\Corejava\\src\\edu\\chitkara\\fileio\\Program2.java");
					//("c:/chitkara/test2.txt");
			int x = stream.read();
			
			while (x != -1) {
				System.out.print((char)x);
				x = stream.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
