package org.cognizant.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file=new RandomAccessFile("c:\\welcome\\emp.dat", "rw");
		
		file.writeInt(566565);
		file.writeUTF("arvind kumar");
		file.writeFloat(12000.0f);
		
		file.writeInt(566566);
		file.writeUTF("karan kumar");
		file.writeFloat(80000.0f);
		
		
		file.writeInt(566567);
		file.writeUTF("chandan kumar");
		file.writeFloat(700000.0f);
		
		file.seek(0);
		
		System.out.println(file.readInt());
		System.out.println(file.readUTF());
		System.out.println(file.readFloat());
		
		System.out.println(file.length());
		//file.seek(3);
		
		System.out.println(file.readInt());
		System.out.println(file.readUTF());
		System.out.println(file.readFloat());
		file.close();
	}
}
