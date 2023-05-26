package edu.chitkara.fileio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		
		try {
			DataInputStream dataInputStream=new DataInputStream
					(new FileInputStream("employee.txt"));
			System.out.println(dataInputStream.readInt());
			System.out.println(dataInputStream.readUTF());
			System.out.println(dataInputStream.readFloat());
			dataInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
