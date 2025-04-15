package com.trng.response;

import com.trng.dto.DepartmentDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentResponse extends DepartmentDto {
    private String error="";
}
