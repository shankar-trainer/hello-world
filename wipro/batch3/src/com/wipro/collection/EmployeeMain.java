package com.wipro.collection;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        String ch = "y";
        Scanner scanner = new Scanner(System.in);
        Employee emp = null;
        EmployeeManagement management = new EmployeeManagement();
        int id;
        String nm;
        float sal;
        do {
            System.out.println("1.Add Employee");
            System.out.println("2.Search Employee");
            System.out.println("3.Remove Employee by position");
            System.out.println("4.Show All Employee");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Add employee operation");
                    System.out.println("Enter Employee id name and salary");
                    emp = null;
                    id = scanner.nextInt();
                    scanner.nextLine();
                    nm = scanner.nextLine();
                    sal = scanner.nextFloat();

                    emp = new Employee(id, nm, sal);
                    management.addEmployee(emp);
                    System.out.println("Employee added");
                    break;
                case 2:
                    System.out.println("search operation");
                    System.out.println("Enter Employee id name and salary");
                    emp = null;
                    id = scanner.nextInt();
                    scanner.nextLine();
                    nm = scanner.nextLine();
                    sal = scanner.nextFloat();

                    emp = new Employee(id, nm, sal);
                    if(management.checkEmployee(emp))
                        System.out.println("Employee present");
                    else
                        System.out.println("Employee not present");
                    break;
                case 3:
                    System.out.println("remove emloyee operation ");
                    System.out.println("Enter the position to remove");
                    int pos=scanner.nextInt();
                    emp=null;
                    emp=management.removeEmployeeByPosition(pos);
                    if(emp==null)
                        System.out.println("employee not found");
                    else
                        System.out.println("employee found and removed");
                    break;
                case 4:
                    System.out.println("view all employee");
                    List<Employee> employees = management.viewAllEmployee();
                    for(Employee e:employees)
                        System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmployeeSalary());
                    break;
                default:
                    System.out.println("not valid operation ");
                    break;
            }
            System.out.println("continue y\\n");
            ch= scanner.next();
        }
        while (ch.equalsIgnoreCase("y"));
    }
}
