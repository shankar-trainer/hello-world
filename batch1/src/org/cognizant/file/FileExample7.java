package org.cognizant.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample7 {

	public static void main(String[] args) {
		try {
			DataInputStream dataInputStream=new DataInputStream(new FileInputStream(
					("C:\\welcome\\empdata.txt")));
			
			System.out.println("emp data from the file ");
			System.out.println(dataInputStream.readInt());
			System.out.println(dataInputStream.readUTF());
			System.out.println(dataInputStream.readFloat());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
