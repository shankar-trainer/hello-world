package com.wipro.collection;

import java.util.Arrays;
import java.util.Comparator;

class EmployeeSortById implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getEmpId() > o2.getEmpId())
            return 1;
        else if (o1.getEmpId() < o2.getEmpId())
            return -1;
        else
            return 0;
    }
}
class EmployeeSortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

public class EmployeeMain {
    static void display(Employee[] emp) {
        for (Employee em : emp)
            System.out.println(em.getEmpId() + "\t" + em.getEmpName() + "\t" + em.getEmpSalary());
    }

    public static void main(String[] args) {
        Employee employee[] = new Employee[4];//created array
        employee[0] = new Employee(10003, "suresh kumar", 20000);// create object
        employee[1] = new Employee(10002, "pankaj kumar", 25000);// create object
        employee[2] = new Employee(10004, "amit kumar", 30000);// create object
        employee[3] = new Employee(10001, "sumit kumar", 40000);// create object

        System.out.println("before sorting employees are ");
        display(employee);

        Arrays.sort(employee,new EmployeeSortById());
        System.out.println("after sorting by id  employees are ");
        display(employee);

        Arrays.sort(employee,new EmployeeSortByName());
        System.out.println("after sorting by name  employees are ");
        display(employee);
    }
}
src