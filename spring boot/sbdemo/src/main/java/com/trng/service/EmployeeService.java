package com.trng.service;

import com.trng.dto.EmployeeDto;
import com.trng.model.Department;
import com.trng.model.Employee;
import com.trng.repository.EmployeeRepository;
import com.trng.request.EmployeeRequest;
import com.trng.response.EmployeeResponse;
import com.trng.response.EmployeeResponse1;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentService departmentService;

    @Transactional
    public EmployeeResponse addEmployee(EmployeeRequest employeeRequest) {
        Department department = departmentService.getDepartmentByName(employeeRequest.getDepartmentName());
        EmployeeResponse response = new EmployeeResponse();
        if (department != null) {
            Employee employee = new Employee();
            employee.setFirstName(employeeRequest.getFirstName());
            employee.setLastName(employeeRequest.getLastName());
            employee.setEmailId(employeeRequest.getEmailId());
            employee.setDepartment(department);
            Employee emp = employeeRepository.save(employee);
            BeanUtils.copyProperties(emp, response);
            response.setDepartmentId(emp.getDepartment().getDepartmentId());
            response.setDepartmentName(emp.getDepartment().getDepartmentName());
            return response;
        }
        BeanUtils.copyProperties(employeeRequest, response);
        response.setError("Department does not exists");
        return response;
    }

    @Transactional
    public EmployeeResponse updateEmployee(EmployeeRequest employeeRequest) {
        EmployeeResponse response = new EmployeeResponse();
        try {
            Optional<Employee> employeeOptional = employeeRepository.findById(employeeRequest.getEmployeeId());
            if (employeeOptional.isPresent()) {
                Employee employee = employeeOptional.get();
                Department department = departmentService.getDepartmentByName(employeeRequest.getDepartmentName());
                employee.setDepartment(department);
                employee.setEmailId(employeeRequest.getEmailId());
                Employee emp = employeeRepository.save(employee);
                BeanUtils.copyProperties(emp, response);
                response.setDepartmentId(emp.getDepartment().getDepartmentId());
                response.setDepartmentName(emp.getDepartment().getDepartmentName());
                return response;
            }
        } catch (Exception e) {
            BeanUtils.copyProperties(employeeRequest, response);
            response.setError("Employee does not does not exists");
        }
        return response;
    }

    @Transactional
    public EmployeeResponse deleteEmployee(EmployeeRequest employeeRequest) {
        EmployeeResponse response = new EmployeeResponse();
        Optional<Employee> employee = employeeRepository.findById(employeeRequest.getEmployeeId());
        if (employee.isPresent()) {
            Employee emp = employee.get();
            employeeRepository.deleteById(emp.getEmployeeId());
            BeanUtils.copyProperties(emp, response);
            response.setDepartmentId(emp.getDepartment().getDepartmentId());
            response.setDepartmentName(emp.getDepartment().getDepartmentName());
            return response;
        }
        response.setError("Department does not exists");
        return response;
    }

    @Transactional(readOnly = true)
    public EmployeeResponse1 getAllEmployee() {
        EmployeeResponse1 employeeResponse1 = new EmployeeResponse1();
        List<Employee> employeeList = employeeRepository.findAll();
        if (!CollectionUtils.isEmpty(employeeList)) {
            List<EmployeeDto> dtoList = employeeList.stream().filter(Objects::nonNull).map(employee -> {
                EmployeeDto dto = new EmployeeDto();
                dto.setEmployeeId(employee.getEmployeeId());
                dto.setFirstName(employee.getFirstName());
                dto.setLastName(employee.getLastName());
                dto.setEmailId(employee.getEmailId());
                dto.setDepartmentId(employee.getDepartment().getDepartmentId());
                dto.setDepartmentName(employee.getDepartment().getDepartmentName());
                return dto;
            }).toList();
            employeeResponse1.setEmployeeDtoList(dtoList);
            return employeeResponse1;
        }
        employeeResponse1.setError("Employee does not exists");
        return employeeResponse1;
    }

    // get an employee based on Id
    @Transactional(readOnly = true)
    public EmployeeResponse getEmployeeById(Long employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        EmployeeResponse employeeResponse = new EmployeeResponse();
        if (employee.isPresent()) {
            Employee emp = employee.get();
            BeanUtils.copyProperties(emp, employeeResponse);
            employeeResponse.setDepartmentId(emp.getDepartment().getDepartmentId());
            employeeResponse.setDepartmentName(emp.getDepartment().getDepartmentName());

            return employeeResponse;
        }
        employeeResponse.setError("Employee id  " + employeeId + " not exists");
        return employeeResponse;
    }
}
