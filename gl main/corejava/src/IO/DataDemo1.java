package IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	float salary;
	
}

public class DataDemo1 {

	public static void main(String[] args) throws IOException {
		
		DataOutputStream stream=new DataOutputStream(new FileOutputStream("c:\\welcome\\emp.dat"));
		
		Scanner scanner=new Scanner(System.in);
		Employee employee[]=new Employee[2];
		
		for (int i = 0; i <=1; i++) {
		 employee[i]=new Employee();
		 System.out.println("Enter id name and salary");
		 
		 employee[i].id=scanner.nextInt();
		 scanner.nextLine();
		 employee[i].name=scanner.nextLine();
		 employee[i].salary=scanner.nextFloat();
		 
		 stream.writeInt(employee[i].id);
		 stream.writeUTF(employee[i].name);
		 stream.writeFloat(employee[i].salary);		 
		}		
		scanner.close();
		stream.close();
		
	}
}
