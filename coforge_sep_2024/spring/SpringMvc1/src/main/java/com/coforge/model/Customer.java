package com.coforge.model;

import lombok.*;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;

@Data
public class Customer {

    @NotNull(message = "id is null")
    @Min(message = "id must be minimum 10000" ,value = 10000)
    @Max(message = "id must of maximum 50000" ,value = 50000)
    private Integer id;

    @NotBlank(message = "name is blank")
    @Size(min = 10,max=20,message = "name must of minimum 10 or maximum 20 character")
    private String name;

    @NotNull(message = "salary is null")
    @Min(message = "salary must be minimum 5000" ,value = 5000)
    @Max(message = "salary must of maximum 500000" ,value = 500000)
    private Float salary;

}
