package com.abc;

import com.abc.exception.EmployeeExeption;
import com.abc.model.Employee;
import com.abc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
    public class EmployeeMain1  implements CommandLineRunner {

        public static void main(String[] args) {

            SpringApplication.run(com.abc.EmployeeMain1.class,args);
        }

        @Autowired
        EmployeeService employeeService;

        Scanner scanner=new Scanner(System.in);
        @Override
        public void run(String... args) throws Exception {
            String ch="y";
            Employee employee;

            while(ch.equals("y")){
                System.out.println("1.add Employee");
                System.out.println("2.search Employee");
                System.out.println("3.show all  Employee");

                int op= scanner.nextInt();
                try{
                switch (op){
                    case 1:
                        employee=null;
                        employee=new Employee();
                        System.out.println("enter name salary");
                        scanner.nextLine();
                        employee.setEmployeeName(scanner.nextLine());
                        employee.setEmployeeSalary(scanner.nextFloat());

                        employeeService.addEmployee(employee);
                        break;
                    case 2:
                        System.out.println("enter id to search ");
                        System.out.println(employeeService.searchEmployee(scanner.nextInt()));
                        break;
                    case 3:
                        employeeService.getEmployeeList().forEach(System.out::println);
                        break;
                    default:
                        System.out.println("wrong choice");
                        break;
                }

            }
            catch (EmployeeExeption e){
                System.err.println(e.getMessage());
                }
                System.out.println("continue y\\n");
                ch= scanner.next();
            }


        }
    }
