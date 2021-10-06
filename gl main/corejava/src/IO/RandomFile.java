package IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("src/IO/WriterDemo1.java", "rw");

		file.seek(200);

		int x = 0;
		byte b[] = new byte[1000];
		file.read(b);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print((char)b[i]);
		}
		
		

		/*
		 * while((x=file.read())!=-1){
		 * 
		 * System.out.print((char)x); }
		 */
		
				file.close();

	}
}
