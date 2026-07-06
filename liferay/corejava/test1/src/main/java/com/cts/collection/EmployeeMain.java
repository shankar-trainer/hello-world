package com.cts.collection;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee(10001, "sumit kumar", 56000);
        Employee employee2 = new Employee(10002, "vimal kumar", 86000);
        Employee employee3 = new Employee(10003, "vimal kumar", 86000);

        EmployeeOperation operation = new EmployeeOperation();

        operation.addEmployee(employee1);
        operation.addEmployee(employee2);
        System.out.println("all employee");

        for (Employee e : operation.allEmployee())
            System.out.println(e);

        if (operation.searchEmployee(employee3) != null) {
            System.out.println("found " + employee1);
        } else
            System.out.println("employee not found");

        if (operation.removeEmployee(employee1) != null) {
            System.out.println("removed " + employee1);
        } else
            System.out.println("employee not found");

        System.out.println("all employee");
        for (Employee e : operation.allEmployee())
            System.out.println(e);
    }
}
