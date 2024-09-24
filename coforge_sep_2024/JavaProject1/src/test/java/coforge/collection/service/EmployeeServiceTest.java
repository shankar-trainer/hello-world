package coforge.collection.service;

import com.coforge.collection.model.Employee;
import com.coforge.collection.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceTest {

    Employee employee1, employee2;
    EmployeeService employeeService;

    @BeforeEach
    void init() {
        employeeService = new EmployeeService();
        employee1 = new Employee();
        employee1.setId(10001);
        employee1.setName("suraj partap");
        employee1.setSalary(30000);

        employee2 = new Employee();
        employee2.setId(10001);
        employee2.setName("suraj partap");
        employee2.setSalary(30000);

        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
    }

    @Test
    void testGetAllEmployee() {
        Assertions.assertEquals(employeeService.getAllEmployee().size(), 2);
    }

    @Test
    void testSearchEmployee() {
        Employee employee3 = new Employee();
        employee3.setId(10001);
        employee3.setName("suraj partap");
        employee3.setSalary(30000);
        Assertions.assertTrue(employeeService.searchEmployee(employee3));
    }

    @Test
    void testAddEmployee() {
        Employee employee4 = new Employee();
        employee4.setId(10005);
        employee4.setName("amit kumar");
        employee4.setSalary(80000);
        employeeService.addEmployee(employee4);
        Assertions.assertTrue(employeeService.searchEmployee(employee4));
        Assertions.assertNotNull(employee4);
        Assertions.assertEquals(employeeService.getAllEmployee().size(), 3);
    }

    @Test
    void testRemoveEmployee() {
        Employee employee5 = new Employee();
        employee5.setId(10001);
        employee5.setName("suraj partap");
        employee5.setSalary(30000);

        Assertions.assertTrue(employeeService.removeEmployee1(employee5));
        Assertions.assertEquals(employeeService.getAllEmployee().size(), 1);
    }
    @Test
    void testUpdateEmployee() {
        Employee employee5 = new Employee();
        employee5.setId(10001);
        employee5.setName("suraj partap");
        employee5.setSalary(30000);

        Employee employee6 = new Employee();
        employee6.setId(10006);
        employee6.setName("pankaj kumar");
        employee6.setSalary(60000);

        Assertions.assertTrue(employeeService.UpdateEmployee1(employee5,employee6));
        Assertions.assertTrue(employeeService.searchEmployee(employee6));

    }
}
