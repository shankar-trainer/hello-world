package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo5 {

	public static void main(String[] args) throws IOException {
		 
		 FileInputStream stream=new FileInputStream("src/IO/FileDemo4.java");
	
		 FileOutputStream stream2=new FileOutputStream("c:/welcome/hello.java");
		 
		 int x=stream.read();
		 while(x!=-1){
			 stream2.write(x);
			 x=stream.read();			 
		 }
		 stream.close();
		 stream2.close();
	}
}
