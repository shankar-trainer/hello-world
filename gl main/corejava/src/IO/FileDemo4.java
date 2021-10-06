package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		 
		 FileInputStream stream=new FileInputStream("c:/welcome/product.csv");
				 
				 //("c:/welcome/abc.txt");
		 
		 int x=stream.read();
		 while(x!=-1){
			 char c=(char)x;
			 if(x==',')
			 System.out.print("\t");
			 else 
				 System.out.print(c);
			 	 
			 x=stream.read();
		 }
		 stream.close();
	}
}
