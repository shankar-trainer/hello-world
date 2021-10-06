package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo7 {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream stream=new FileInputStream("c:/welcome/product.csv");
		BufferedInputStream stream2=new BufferedInputStream(stream);		 
		 stream2.skip(10);
		 int x=stream2.read();
		 while(x!=-1){
			 char c=(char)x;
			 if(c==',')
			 System.out.print("\t");
			 else 
				 System.out.print(c);
			 x=stream2.read();
		 }
		 stream.close();
		 stream2.close();
	}
}
