package org.trng.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
public class Employee {
    private Integer empId;
    private String empName;
    private String empCity;

}
