package org.trng;

import org.trng.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");
        System.out.println(Application1.readName());*/
        System.out.println( new EmployeeService().getEmployee());
    }
}