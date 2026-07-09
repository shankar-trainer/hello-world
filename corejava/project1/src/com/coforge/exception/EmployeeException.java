package com.coforge.exception;

public class EmployeeException  extends  Exception{
    public EmployeeException(String message) {
        super(message);
    }
}
class EmployeeMain{
    public static void main(String[] args) {
        Employee employee=new Employee();
        try {
//            employee.setEmpId(0);
            employee.setEmpId(1);
//            employee.setEmpName("");
//            employee.setEmpName("ram");
            employee.setEmpName("ram kumar");
//            employee.setEmpSalary(0);
//            employee.setEmpSalary(4000);
            employee.setEmpSalary(40000);
            System.out.println("employee data ");
            System.out.println("\tid  "+employee.getEmpId());
            System.out.println("\tname  "+employee.getEmpName());
            System.out.println("\tsalary  "+employee.getEmpSalary());
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
        }

}