package com.wipro.collection;

import java.util.Arrays;
import java.util.Comparator;

class EmployeeSortByid implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
     if(o1.getEmployeeId()>o2.getEmployeeId())
         return  1;
    else  if(o1.getEmployeeId()<o2.getEmployeeId())
         return  -1;
     //if(o1.getEmployeeId()==o2.getEmployeeId())
       else   return  0;

    }
}
class EmployeeSortByName implements  Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        //return  o1.getEmployeeName().compareTo(o2.getEmployeeName());
        return  o2.getEmployeeName().compareTo(o1.getEmployeeName());
    }
}
public class EmployeeMain1 {
    public static void main(String[] args) {

        Employee employee[]=new Employee[4];
        employee[0]=new Employee(1003,"ram kumar",20000);
        employee[1]=new Employee(1001,"amit kumar",30000);
        employee[2]=new Employee(1002,"suman kumar",25000);
        employee[3]=new Employee(1004,"vimal kumar",56000);

        System.out.println("Unsorted employees");
        for(Employee e:employee)
            System.out.println(e);

        Arrays.sort(employee,new EmployeeSortByid());
        System.out.println("\n after sorting by id  employees are ");

        for(Employee e:employee)
            System.out.println(e);

        Arrays.sort(employee,new EmployeeSortByName());
        System.out.println("\n after sorting by name  employees are ");

        for(Employee e:employee)
            System.out.println(e);

    }
}













