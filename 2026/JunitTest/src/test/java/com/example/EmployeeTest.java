package com.example;

//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    Employee employee, employee2, employee3;

    @BeforeEach
    public void init() throws EmployeeException {
        employee = new Employee(10001, "suresh kumar", 56000.56f);
        employee2 = new Employee(10001, "suresh kumar", 56000.56f);
        assertThrows(EmployeeException.class, () ->
                employee3 = new Employee(-10001, "suresh kumar", 56000.56f)
        );
    }

    @Test
    public void testEmployee() {
        assertNotNull(employee);
        assertEquals(employee, employee2);
//     assertSame(employee,employee2);
        assertSame("hello", "hello");

        //assertSame("hello",new String("hello"));
        assertEquals("hello", new String("hello"));
        assertNotSame("hello", new String("hello"));
        //assertSame checks references, assertEquals checks content
    }

    @Test
    public void testId() {
//  Assertions.assertEquals(10001,employee.getId());
        assertEquals(10001, employee.getId());
    }

    @Test
    public void testName() {
        assertEquals("suresh kumar", employee.getName());
    }

    @Test
    public void testSalary() {
        assertEquals(56000.56f, employee.getSalary());
    }


}
