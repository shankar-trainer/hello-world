package com.trng.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class EmployeeDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
    private Long departmentId;
    private String departmentName;
}
