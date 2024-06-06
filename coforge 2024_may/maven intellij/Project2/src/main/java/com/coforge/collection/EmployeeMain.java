package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortById implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
         if(o1.getEmpId()>o2.getEmpId())
             return  1;
         else if(o1.getEmpId()<o2.getEmpId())
             return  -1;
         else
             return  0;

    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        int id1[]={10003,10001,10002};
        String nm[]={"suresh kumar","amit kumar","pawan kumar"};
        float sal[]={35000,12000,45000};

        ArrayList<Employee> empList=new ArrayList<>();

        for (int i = 0; i <=2 ; i++) {
            empList.add(new Employee(id1[i],nm[i],sal[i]));
       }
        System.out.println("all employees ");
        for(Employee employee:empList)
            System.out.println(employee);

        Collections.sort(empList,new SortById());

        System.out.println("after sorting all employees ");
        for(Employee employee:empList)
            System.out.println(employee);
    }
}
