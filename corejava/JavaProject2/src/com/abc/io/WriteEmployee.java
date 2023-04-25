package com.abc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by shankar on 3/22/2023.
 */
public class WriteEmployee {
    public static void main(String[] args) throws IOException {
        Employee employee=new Employee(343443,"suresh kumar",450000);
        ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("C:/welcome/welcome1/employee.txt"));

        stream.writeObject(employee);

    }
}
