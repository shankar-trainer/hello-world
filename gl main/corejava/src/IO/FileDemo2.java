package IO;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File file=new File("hello.txt");
		
		if(file.createNewFile())
		  System.out.println(file.getAbsolutePath()+" file created");

		file=new File("welcome\\org");
		file.mkdir();
		
		file=new File("welcome\\org\\edu\\com");
		file.mkdirs();
		
		file.delete();
	}
}
