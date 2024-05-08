package com.wipro.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {

    private List<Employee> employeeList;

    public EmployeeManagement() {
        employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public Employee removeEmployeeByPosition(int p){
        return employeeList.remove(p);
    }

    public boolean checkEmployee(Employee emp){
        return employeeList.contains(emp);
    }

    public List<Employee> viewAllEmployee(){
        return  employeeList;
    }
}
