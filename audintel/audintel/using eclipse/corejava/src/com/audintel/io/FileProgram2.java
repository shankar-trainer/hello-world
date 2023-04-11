package com.audintel.io;

import java.io.File;
import java.io.IOException;

public class FileProgram2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("/welcome/hello.txt");

		file.createNewFile();

		Thread.sleep(1000 * 10);

		file.delete();

		file = new File("/welcome/user");
		file.mkdir();

		file = new File("/welcome/dir1/dir2/dir3");
		file.mkdirs();

		Thread.sleep(1000 * 10);

		file.delete();
		
		file = new File("/welcome/dir1/dir2");
		file.delete();
		
		file = new File("/welcome/dir1");
		file.delete();
		
		
       
	}
}
