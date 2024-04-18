package org.trng.service;

import org.trng.model.Employee;

import java.util.Scanner;

public class EmployeeService {
    public Employee getEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input emp Id");
        Integer id = scanner.nextInt();

        System.out.println("Input emp name");
        String name = scanner.next();

        System.out.println("Input emp city");
        String city = scanner.next();
        return Employee.builder().empId(id).empName(name).empCity(city).build();
    }
}
