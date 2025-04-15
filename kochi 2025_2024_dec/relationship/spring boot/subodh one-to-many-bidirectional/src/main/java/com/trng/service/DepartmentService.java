package com.trng.service;

import com.trng.dto.DepartmentDto;
import com.trng.dto.DepartmentEmpDto;
import com.trng.dto.EmployeeDto;
import com.trng.model.Department;
import com.trng.repository.DepartmentRepository;
import com.trng.request.DepartmentRequest;
import com.trng.response.DepartmentResponse;
import com.trng.response.DepartmentResponse1;
import com.trng.response.DepartmentResponse2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public DepartmentResponse addDepartment(DepartmentRequest departmentRequest) {
        Department department = new Department();
        department.setDepartmentName(departmentRequest.getDepartmentName());
        Department depart = departmentRepository.save(department);
        DepartmentResponse response = new DepartmentResponse();
        response.setDepartmentId(depart.getDepartmentId());
        response.setDepartmentName(depart.getDepartmentName());
        return response;
    }

    @Transactional
    public DepartmentResponse updateDepartment(DepartmentRequest departmentRequest) {
        DepartmentResponse response = new DepartmentResponse();
        Optional<Department> departmentOptional = departmentRepository.findById(departmentRequest.getDepartmentId());
        if (departmentOptional.isPresent()) {
            Department depart = departmentOptional.get();
            depart.setDepartmentName(departmentRequest.getDepartmentName());
            departmentRepository.save(depart);
            BeanUtils.copyProperties(depart, response);
            return response;
        }
        response.setError("Department not exists");
        return response;
    }

    @Transactional(readOnly = true)
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findAllByDepartmentName(departmentName);
    }

    @Transactional(readOnly = true)
    public DepartmentResponse getDepartmentById(Long departmentId) {
        DepartmentResponse response = new DepartmentResponse();
        Optional<Department> departmentOptional = departmentRepository.findById(departmentId);
        if (departmentOptional.isPresent()) {
            Department department = departmentOptional.get();
            BeanUtils.copyProperties(department, response);
            return response;
        }
        response.setError("Employee does not does not exists");
        return response;
    }

    @Transactional(readOnly = true)
    public DepartmentResponse getDepartmentByDepartmentName(String departmentName) {
        DepartmentResponse response = new DepartmentResponse();
        Department department = getDepartmentByName(departmentName);
        if (department != null) {
            BeanUtils.copyProperties(department, response);
            return response;
        }
        response.setError("Employee does not does not exists");
        return response;
    }
    @Transactional(readOnly = true)
    public DepartmentResponse1 getAllDepartment() {
        DepartmentResponse1 response = new DepartmentResponse1();
        List<Department> departmentList = departmentRepository.findAll();
        if(!CollectionUtils.isEmpty(departmentList)) {
            List<DepartmentDto> dtoList = departmentList.stream().filter(Objects::nonNull).map(department -> {
                DepartmentDto dto = new DepartmentDto();
                dto.setDepartmentId(department.getDepartmentId());
                dto.setDepartmentName(department.getDepartmentName());
                return dto;
            }).toList();
            response.setResponseList(dtoList);
            return response;
        }
        response.setError("Department does not exists");
        return response;
    }

   @Transactional(readOnly = true)
    public DepartmentResponse2 getAllDepartmentWithEmp() {
       DepartmentResponse2 response = new DepartmentResponse2();
       List<DepartmentEmpDto> responseList = new ArrayList<>();
        List<Department> departments = departmentRepository.findAll();
        departments.stream().filter(Objects::nonNull).forEach(department -> {
            DepartmentEmpDto dto = new DepartmentEmpDto();
            dto.setDepartmentId(department.getDepartmentId());
            dto.setDepartmentName(department.getDepartmentName());

            List<EmployeeDto> employeeDtoList = new ArrayList<>();
            department.getEmployees().forEach(emp -> {
                EmployeeDto employeeDto = new EmployeeDto();
                employeeDto.setEmployeeId(emp.getEmployeeId());
                employeeDto.setFirstName(emp.getFirstName());
                employeeDto.setLastName(emp.getLastName());
                employeeDto.setEmailId(emp.getEmailId());
                employeeDtoList.add(employeeDto);
            });
            dto.setEmployees(employeeDtoList);
            responseList.add(dto);
            response.setResponseList(responseList);
        });
        return response;
    }
}
