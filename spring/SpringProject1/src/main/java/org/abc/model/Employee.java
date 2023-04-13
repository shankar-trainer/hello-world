package org.abc.model;

import lombok.Data;

/**
 * Created by shankar on 4/11/2023.
 */
@Data
public class Employee {
    private int empId;
    private String empName;
    private float empSalary;
    private Address address;

}
