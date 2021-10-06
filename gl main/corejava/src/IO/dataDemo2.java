package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dataDemo2 {

	public static void main(String[] args) throws IOException {

		DataInputStream stream = new DataInputStream(new FileInputStream("c:\\welcome\\emp.dat"));

		Employee employee[] = new Employee[2];

		for (int i = 0; i <= 1; i++) {
			employee[i]=new Employee();
			employee[i].id = stream.readInt();
			employee[i].name = stream.readUTF();
			employee[i].salary = stream.readFloat();
		}
		
		for (Employee employee2 : employee) {
			System.out.println("\nEmployee Record");
			System.out.println("\tId "+employee2.id);
			System.out.println("\tName "+employee2.name);
			System.out.println("\tSalary "+employee2.salary);
		}
		stream.close();
	}
}
