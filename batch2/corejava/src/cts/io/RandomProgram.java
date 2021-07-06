package cts.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomProgram {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("c:\\hello\\myfile2.txt", "rw");

		file.writeInt(100001);
		file.writeUTF("raman kumar");
		file.writeFloat(12000);

		file.writeInt(100002);
		file.writeUTF("janki kumar");
		file.writeFloat(16000);

		System.out.println(file.length());

		file.seek(0);

		System.out.println("\n ---------------1st record-----------\n");
		System.out.println(file.readInt());
		System.out.println(file.readUTF());
		System.out.println(file.readFloat());

		long l = file.getFilePointer();

		file.seek(l);

		System.out.println("\n ---------------2nd record-----------\n");
		System.out.println(file.readInt());
		System.out.println(file.readUTF());
		System.out.println(file.readFloat());

		file.close();

	}
}
