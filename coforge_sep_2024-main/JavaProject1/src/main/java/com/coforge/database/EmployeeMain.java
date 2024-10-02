package com.coforge.database;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        String ch="y";
        try{
        EmployeeDao employeeDao=new EmployeeDao();
        Employee employee;
        Scanner scanner=new Scanner(System.in); 
        while(ch.equals("y")){
            System.out.println("1.Add Record");
            System.out.println("2.Search Record");
            System.out.println("3.Show All Record");
            int op=scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Enter id name and salary");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    String name=scanner.nextLine();
                    float sal=scanner.nextFloat();
                    employee=null;
                    employee=new Employee();
                    employee.setId(id);
                    employee.setName(name);
                    employee.setSalary(sal);
                    if(employeeDao.addEmployee(employee))
                        System.out.println("Record added");
                    else
                        System.out.println("Id already present");
                    break;
                case 2:
                    id=0;
                    System.out.println("Enter id ");
                    id=scanner.nextInt();
                    if(employeeDao.searchEmployeeById(id)==null)
                        System.out.println("id not found ");
                    else {
                        employee=null;
                        employee=employeeDao.searchEmployeeById(id);
                        System.out.println("id found "+employee);
                    }
                    break;
                case 3:
                    System.out.println("All Record");
                    Map<Integer, Employee> allEmployees = employeeDao.getAllEmployees();
                    Collection<Employee> values = allEmployees.values();
                    for(Employee e:values)
                        System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println("continue y\\n");
            ch=scanner.next();
        }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
