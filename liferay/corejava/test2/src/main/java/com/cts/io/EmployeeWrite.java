package com.cts.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeWrite {
    // serialization
    public static void main(String[] args) throws IOException {
        Employee employee1 = new Employee();
        employee1.setEmpId(100001);
        employee1.setEmpName("suresh kumar");
        employee1.setEmpSalary(67000);

        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("emp.txt"));

        stream.writeObject(employee1);
        System.out.println("employee data written  to the file");
    }

}
