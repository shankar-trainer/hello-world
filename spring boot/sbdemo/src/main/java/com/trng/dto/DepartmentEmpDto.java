package com.trng.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DepartmentEmpDto {
    private Long departmentId;
    private String departmentName;
    private List<EmployeeDto> employees;
}
