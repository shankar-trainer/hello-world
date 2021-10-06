package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerSerialisationDemo2 {

	public static void main(String[] args) throws IOException {
		Customer cust1=new Customer(1001,"mohan kumar","chennai");
		cust1.country="Nepal";
		ObjectOutputStream stream=null;
		try {
			stream=new ObjectOutputStream(new FileOutputStream("cust.ser"));
			stream.writeObject(cust1);
			System.out.println("Object written to the file");
		} catch (IOException e) {		 
			System.err.println(e);
		}
		finally {
			stream.close();
		}
		
		
		
		
		
	}
}
