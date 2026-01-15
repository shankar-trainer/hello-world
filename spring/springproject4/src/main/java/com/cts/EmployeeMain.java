package com.cts;

import com.cts.exception.EmployeeException;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeService.class);
        EmployeeService service = context.getBean(EmployeeService.class);

        String ch = "y";
        Employee employee;
        try {
            do {
                System.out.println("1. Add Employee");
                System.out.println("2. Get All Employee");
                Scanner scanner = new Scanner(System.in);
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println("enter id name and salary");
                        employee = new Employee();
                        employee.setId(scanner.nextInt());
                        scanner.nextLine();
                        employee.setName(scanner.nextLine());
                        employee.setSalary(scanner.nextFloat());
                        Employee e = service.addEmployee(employee);
                        System.out.println("added " + e);
                        break;
                    case 2:
                        System.out.println("all employee");
                        for (Employee e1 : service.getAllEmployee())
                            System.out.println(e1);
                        break;
                    default:
                        System.out.println("wrong choice try again");
                }
                System.out.println("continue y\\n");
                ch = scanner.next();
            }
            while (ch.equals("y"));
        }
        catch (EmployeeException e){
            System.out.println(e.getMessage());
        }
    }

}
