package com.coforge.collection.main;

import com.coforge.collection.model.Employee;
import com.coforge.collection.service.EmployeeService;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = null;
        String ch = "y";
        EmployeeService service = new EmployeeService();

        while (ch.equals("y")) {
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. GetAll  Employee");
            int op = scanner.nextInt();

            switch (op) {
                case 1: {
                    employee = null;
                    employee = new Employee();
                    System.out.println("Enter id name and salary");
                    employee.setId(scanner.nextInt());
                    scanner.nextLine();
                    employee.setName(scanner.nextLine());
                    employee.setSalary(scanner.nextFloat());
                    service.addEmployee(employee);
                    break;
                }
                case 2: {
                    employee = null;
                    employee = new Employee();
                    System.out.println("Enter id name and salary");
                    employee.setId(scanner.nextInt());
                    scanner.nextLine();
                    employee.setName(scanner.nextLine());
                    employee.setSalary(scanner.nextFloat());
                    if(service.searchEmployee(employee))
                        System.out.println("Employee is present ");
                    else
                        System.out.println("Employee not present");
                    break;
                }

                case 3: {
                    if(service.getAllEmployee().size()==0)
                        System.out.println("employee list is empty");
                    else {
                        for (Employee e : service.getAllEmployee())
                            System.out.println(e);
                    }
                    break;
                }
                default:{
                    System.out.println("invalid operation ");
                }
            }

            System.out.println("\nContinue y\\n");
            ch = scanner.next();
        }
    }
}