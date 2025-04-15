package com.trng.service;

import com.trng.request.EmployeeRequest;
import com.trng.response.EmployeeResponse;
import com.trng.response.EmployeeResponse1;
import com.trng.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

   /* @Test
    public void deleteEmployee() {
        EmployeeRequest request = new EmployeeRequest();
        request.setEmployeeId(4l);
        var response = employeeService.deleteEmployee(request);
        System.out.println(JsonUtil.toJson(response));
        Assert.assertNotNull(response);
    }*/

   /* @Test
    public void addEmployee() {
        EmployeeRequest request = new EmployeeRequest();
        request.setFirstName("Suman");
        request.setLastName("Singh");
        request.setEmailId("suman@gmail.com");
        request.setDepartmentName("IT");
        var employeeResponse = employeeService.addEmployee(request);
        System.out.println(JsonUtil.toJson(employeeResponse));
        Assert.assertNotNull(employeeResponse);
    }*/

   /* @Test
    public void updateEmployee() {
        EmployeeRequest request = new EmployeeRequest();
        request.setEmployeeId(4l);
        request.setFirstName("Suman");
        request.setLastName("Sing1");
        request.setEmailId("suman1@gmail.com");
        request.setDepartmentName("Admin");
        var employeeResponse = employeeService.updateEmployee(request);
        System.out.println(JsonUtil.toJson(employeeResponse));
        Assert.assertNotNull(employeeResponse);
    }
*/
   /* @Test
    public void getEmployeeById() {
        var employee = employeeService.getEmployeeById(1l);
        System.out.println(JsonUtil.toJson(employee));
        Assert.assertNotNull(employee);
    }*/


/*    @Test
    public void getAllEmployee() {
        var allEmployee = employeeService.getAllEmployee();
        System.out.println(JsonUtil.toJson(allEmployee));
        Assert.assertNotNull(allEmployee);
    }*/
}