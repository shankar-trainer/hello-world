package org.trng.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.trng.model.Employee;

import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;
import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeServiceTest {

    private EmployeeService employeeService;
    private static final Integer empId = 100;
    private static final String empName = "Shankar";
    private static final String empCity = "Noida";

    @BeforeAll
    public void init() {
        employeeService = new EmployeeService();
    }

    @Test
    void getEmployee() throws Exception{
        // withTextFromSystemIn("100","sks","noida").execute(() -> assertNotNull(new EmployeeService().getEmployee()));

        withTextFromSystemIn(String.valueOf(empId),empName,empCity).execute(() -> {
            Employee emp = employeeService.getEmployee();
            assertNotNull(emp);
            assertEquals(empId, emp.getEmpId());
            assertEquals(empName, emp.getEmpName());
            assertEquals(empCity, emp.getEmpCity());
        });
    }
}