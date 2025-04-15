package com.trng.response;

import com.trng.dto.DepartmentEmpDto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class DepartmentResponse2 implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private List<DepartmentEmpDto> responseList;
    private String error="";
}
