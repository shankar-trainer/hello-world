package cts.com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmployee {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("C:\\welcome1\\emp.dat"));
		
	Employee e1=(Employee)	inputStream.readObject();
	
	System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary()+" "+e1.getState());
	
	}
}
