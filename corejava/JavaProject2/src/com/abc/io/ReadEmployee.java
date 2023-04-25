package com.abc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by shankar on 3/22/2023.
 */
public class ReadEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("C:/welcome/welcome1/employee.txt"));
        Employee emp = (Employee) objectInputStream.readObject();
        System.out.println("Employee information ");
        System.out.println("\tId :"+emp.getId());
        System.out.println("\tName :"+emp.getName());
        System.out.println("\tSalary :"+emp.getSalary());
    }

}
