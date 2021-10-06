package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomerDeSerialisationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream stream = new ObjectInputStream(new FileInputStream("cust.ser"));

		Customer cust1 = (Customer) stream.readObject();

		System.out.println("Customer Information");
		System.out.println("Id is " + cust1.getPid());
		System.out.println("Name is " + cust1.getPname());
		System.out.println("Address is " + cust1.getAddress());
		System.out.println("Country  is " + cust1.country);
 
	 
	}
}
