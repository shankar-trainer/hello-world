package com.trng.response;

import com.trng.dto.EmployeeDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeResponse1{
    private List<EmployeeDto> employeeDtoList;
    private String error="";
}
