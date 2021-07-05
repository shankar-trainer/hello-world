package cts.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.cts.error.Employee;
import org.cts.error.EmployeeException;

public class FilePrg2 {

	public static void main(String[] args) {
		DataOutputStream dataOutputStream = null;
		Employee employee;
		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream
					("c:\\hello\\emp.dat"));
			employee = new Employee();
			employee.setEmployeeId(11123);
			employee.setEmployeeName("harendra kumar");
			employee.setEmployeeSalary(12000);

			dataOutputStream.writeInt(employee.getEmployeeId());
			dataOutputStream.writeUTF(employee.getEmployeeName());
			dataOutputStream.writeFloat(employee.getEmployeeSalary());
			System.out.println("data written to the file");

		} catch (FileNotFoundException | EmployeeException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
