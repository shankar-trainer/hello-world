package com.coforge.stream;

import com.coforge.lambda.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample2 {

    public static void main(String[] args) {
        Employee employee[] = new Employee[3];
        employee[0] = new Employee(10001, "amit kumar", 20000);
        employee[1] = new Employee(10003, "deeak kumar", 15000);
        employee[2] = new Employee(10002, "barjesh kumar", 10000);

        List<Employee> empList=new ArrayList<>(Arrays.asList(employee));

        System.out.println(empList.size());
        empList.forEach(a-> System.out.println(a));
        System.out.println("\n");
        empList.stream().forEach(a-> System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));

        System.out.println("\n emplist salary=10000");

        empList.stream().filter(a->a.getSalary()>10000).forEach(a-> System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));

        Comparator<Employee> comparator=(a,b)->Integer.valueOf(a.getId()).compareTo(Integer.valueOf(b.getId()));
        System.out.println("sorted by id ");
        empList.stream().sorted(comparator).forEach(a-> System.out.print(a));

        System.out.println("sorted by name ");
        empList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(a-> System.out.print(a));
        System.out.println("\n\nsorted names");
        empList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(a-> System.out.print(a.getName()+",  "));

        System.out.println("\n\nsorted last name");
        Optional<Employee> max = empList.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).max((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(max.get().getName());

        System.out.println("\nFirst name in sorted list using min"+empList.stream().sorted(comparator).min(comparator).get().getName());

        System.out.println("\nFirst name in sorted list using findFirst "+empList.stream().sorted(comparator).findFirst().get().getName());

        System.out.println("\nLast name in sorted list using findFirst last "+empList.stream().sorted((a, b) -> b.getName().compareTo(a.getName())).findFirst().get().getName());


        List<Integer> list1=new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4}));
        list1.forEach(a-> System.out.print(a+","));
        System.out.println("using map ");
        list1.stream().map(a->a*a).forEach(a-> System.out.print(a+","));

        System.out.println("using reduce");
        Optional<Integer> reduce = list1.stream().reduce((a, b) -> a + b);

        if(reduce.isPresent())
        System.out.println("\nsum is "+reduce.get());
        else if(reduce.isEmpty())
            System.out.println("it is empty");

        System.out.println("collectors ");

        List<Employee> collect = empList.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());

        Set<Employee> set1 = empList.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toSet());
//
//        Collection<Employee> collect1 = empList.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toCollection());


    }

}
