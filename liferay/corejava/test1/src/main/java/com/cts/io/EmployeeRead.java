package com.cts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeRead {
    //deserialization
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("emp.txt"));

        Object obj1 = stream.readObject();

        Employee emp1 = (Employee) obj1;
        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getEmpSalary());

    }

}
