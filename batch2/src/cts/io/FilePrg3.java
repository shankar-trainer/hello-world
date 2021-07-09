package cts.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class FilePrg3 {

	public static void main(String[] args) throws IOException {
		DataInputStream dataInputStream=new DataInputStream
				(new FileInputStream("c:/hello/emp.dat"));
		
	System.out.println("Employee id "+dataInputStream.readInt());
	System.out.println("Employee Name "+dataInputStream.readUTF());
	System.out.println("Employee id "+dataInputStream.readFloat());
	
	dataInputStream.close();
		
	}
}
