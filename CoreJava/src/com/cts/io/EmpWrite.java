package com.cts.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
				
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		
		employee1.setEmpId(10001);
		employee1.setEmpname("hari kumar");
		employee1.setEmpSalary(550000);
		
		employee2.setEmpId(10002);
		employee2.setEmpname("praveen kumar");
		employee2.setEmpSalary(510000);
		
		
		employee3.setEmpId(10003);
		employee3.setEmpname("gopi kumar");
		employee3.setEmpSalary(650000);
		
		ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("c:/hello/emp1.txt"));
		
		stream.writeObject(employee1);
		stream.writeObject(employee2);
		stream.writeObject(employee3);
		
		stream.close();
		
	}
}
