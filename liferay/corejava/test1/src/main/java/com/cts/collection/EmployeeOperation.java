package com.cts.collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeOperation {

    private Set<Employee> empSet;

    EmployeeOperation(){
        empSet=new HashSet<>();
    }

    public Employee addEmployee(Employee employee){
        empSet.add(employee);
        return  employee;
    }
    public Set<Employee> allEmployee(){
        return  empSet;
    }

    public Employee searchEmployee(Employee employee){
        for(Employee e:empSet){
            if(e.equals(employee))
                return  e;
        }
        return  null;
    }
    public Employee removeEmployee(Employee employee){
        if(empSet.contains(employee)) {
            empSet.remove(employee);
        return  employee;
        }
        return  null;
    }

}
