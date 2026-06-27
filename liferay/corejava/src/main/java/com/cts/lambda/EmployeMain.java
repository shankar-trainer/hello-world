package com.cts.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class EmployeMain {

    public static void main(String[] args) {
        Employee employee[]=new Employee[3];
        employee[0]=new Employee(10003,"suresh kumar",30000);
        employee[1]=new Employee(10001,"vivek kumar",37000);
        employee[2]=new Employee(10002,"amit kumar",32000);

        int ar1[]={11,1,10,5};
        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));

      /*  Comparator<Employee> comparator=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return  o1.getName().compareTo(o2.getName());
            }
        };*/

        Comparator<Employee> comparator1=(e1,e2)->e1.getName().compareTo(e2.getName());
        Comparator<Employee> comparator2=(e1,e2)->Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId()));
        Comparator<Employee> comparator3=(e1,e2)->Float.valueOf(e1.getSalary()).compareTo(Float.valueOf(e2.getSalary()));

//      Arrays.sort(employee,new SortByName());
        //Arrays.sort(employee,comparator);
        Arrays.sort(employee,comparator1);
        System.out.println("sorted by name");
        for(Employee e:employee)
            System.out.println(e);

        Arrays.sort(employee,comparator2);
        System.out.println("sorted by id");
        for(Employee e:employee)
            System.out.println(e);

        Arrays.sort(employee,comparator3);
        System.out.println("sorted by salary");
        for(Employee e:employee)
            System.out.println(e);

        System.out.println("sorted by name");

        Stream.of(employee).sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(c-> System.out.println(c));

//        Arrays.sort(employee,Employee::co);


    }
}


//class SortByName implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}