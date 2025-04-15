package com.trng.controller;

import com.trng.request.DepartmentRequest;
import com.trng.request.EmployeeRequest;
import com.trng.response.EmployeeResponse;
import com.trng.response.EmployeeResponse1;
import com.trng.service.DepartmentService;
import com.trng.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeDepartmentController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    //
    @PostMapping(value = "/addemployee")
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.ok(employeeService.addEmployee(employeeRequest));
    }

    @PutMapping(value = "/updateemployee")
    public ResponseEntity<EmployeeResponse> updateEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.ok(employeeService.updateEmployee(employeeRequest));
    }

    @DeleteMapping(value = "/deleteemployee")
    public ResponseEntity<EmployeeResponse> deleteEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.ok(employeeService.deleteEmployee(employeeRequest));
    }

    @GetMapping(value = "/getemployee")
    public ResponseEntity<EmployeeResponse1> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping(value = "/getemployee/{id}")
    public ResponseEntity<EmployeeResponse> getAllDepartment(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    // =============== Department ==============================

    @GetMapping(value = "/getepartmentwithemp")
    public ResponseEntity<?> getAllDepartmentWithEmp() {
        return ResponseEntity.ok(departmentService.getAllDepartmentWithEmp());
    }

    @GetMapping(value = "/geteallpartment")
    public ResponseEntity<?> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartment());
    }

    @GetMapping(value = "/getepartment/{id}")
    public ResponseEntity<?> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

   @PostMapping(value = "/adddepartment")
    public ResponseEntity<?> createDepartment(@RequestBody DepartmentRequest departmentRequest) {
        return ResponseEntity.ok(departmentService.addDepartment(departmentRequest));
    }

    @PostMapping(value = "/getepartmentbyname")
    public ResponseEntity<?> getDepartmentByName(@RequestBody DepartmentRequest departmentRequest) {
        return ResponseEntity.ok(departmentService.getDepartmentByDepartmentName(departmentRequest.getDepartmentName()));
    }

    @PutMapping(value = "/updateepartment")
    public ResponseEntity<?> updateDepartment(@RequestBody DepartmentRequest employeeRequest) {
        return ResponseEntity.ok(departmentService.updateDepartment(employeeRequest));
    }
}
