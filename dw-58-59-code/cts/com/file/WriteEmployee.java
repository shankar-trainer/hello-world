package cts.com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployee {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectOutputStream objectOutputStream=new ObjectOutputStream
				(new FileOutputStream("c:\\welcome1\\emp.dat"));
		
		Employee employee=new Employee();
		employee.setId(67667);
		employee.setName("pankaj kumar");
		employee.setSalary(25000);
		Employee.setState("andhra pardesh");
		
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		System.out.println("object wrote");
	}
}
