package com.coforge.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee[]=new Employee[]{
          new Employee(10002,"ram kumar",20000.0f),
          new Employee(10001,"amit kumar",22000.0f),
          new Employee(10003,"deepak kumar",34000.0f)
        };

        System.out.println("all employees \n"+ Arrays
                .toString(employee));
        /*Comparator<Employee>  comparator=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        };*/
        Comparator<Employee>  comparator=(o1,o2)->o1.getRoll().compareTo(o2.getRoll());

        Arrays.sort(employee,comparator);
        System.out.println("all employees sorted by roll \n"+ Arrays
                .toString(employee));
 Comparator<Employee>  comparator1=(o1,o2)->o1.getName().compareTo(o2.getName());

        Arrays.sort(employee,comparator1);
        System.out.println("all employees sorted by name \n"+ Arrays
                .toString(employee));

        System.out.println("sorted by salary");
        Stream.of(employee).sorted((o1,o2)->o1.getSalary().compareTo(o2.getSalary())).forEach(a-> System.out.println(a));

    }
}
