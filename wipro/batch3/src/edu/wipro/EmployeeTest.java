package edu.wipro;


import com.wipro.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee();
        //outside the package import the class
        // to import the class, it  must be public
       employee.id=989889;
       // to use outside the class, attribute, methods  must be public
        employee.name="pankaj kumar";
     employee.employeeInfo();
    }
}
