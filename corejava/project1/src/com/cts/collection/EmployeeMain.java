package com.cts.collection;

import java.util.Map;

public class EmployeeMain {

    public static void main(String[] args) {
     Employee employee[]=new Employee[3];
     int id[]={111,222,11};
     String nm[]={"charan", "amit","sumit","subhash"};
     float sal[]={20000,12000,13000};

     EmployeeOperation operation=new EmployeeOperation();

        for (int i = 0; i < employee.length ; i++) {
         employee[i]=new Employee();
         employee[i].setId(id[i]);
         employee[i].setName(nm[i]);
         employee[i].setSalary(sal[i]);
        operation.addEmployee(employee[i]);
        }
        System.out.println("all employee list");
        
        Map<Integer, Employee> allEmployee = operation.getAllEmployee();
        for (int k:allEmployee.keySet())
            System.out.println(allEmployee.get(k));

        Employee employee1 = operation.searchEmployeeById(111);
      if(employee1!=null)
          System.out.println("found "+employee1);
      else
          System.out.println("not found");
    }

}
