package com.trng.service;

import com.trng.request.DepartmentRequest;
import com.trng.response.DepartmentResponse;
import com.trng.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

/*    @Test
    public void getAllDepartmentWithEmp() {
        var department = departmentService.getAllDepartmentWithEmp();
        System.out.println(JsonUtil.toJson(department));
        Assert.assertNotNull(department);
    }*/

/*    @Test
    public void getAllDepartment() {
        var department = departmentService.getAllDepartment();
        System.out.println(JsonUtil.toJson(department));
        Assert.assertNotNull(department);
    }*/

/*    @Test
    public void updateDepartment() {
        DepartmentRequest request = new DepartmentRequest();
        request.setDepartmentId(1l);
        request.setDepartmentName("New IT");
        var response = departmentService.updateDepartment(request);
        System.out.println(JsonUtil.toJson(response));
        Assert.assertNotNull(response);
    }*/

/*    @Test
    void getDepartmentById() {
        var department = departmentService.getDepartmentById(1l);
        System.out.println(JsonUtil.toJson(department));
        Assert.assertNotNull(department);
    }*/

/*@Test
    public void getDepartmentByName() {
        var department = departmentService.getDepartmentByDepartmentName("IT");
        System.out.println(JsonUtil.toJson(department));
        Assert.assertNotNull(department);
    }*/

   /* @Test
    public void addDepartment() {
        DepartmentRequest request = new DepartmentRequest();
        request.setDepartmentName("Development");
        var response = departmentService.addDepartment(request);
        Assert.assertNotNull(response);
    }*/
}