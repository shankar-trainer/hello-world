package com.trng.response;

import com.trng.dto.EmployeeDto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class EmployeeResponse extends EmployeeDto{
    private String error="";
}
