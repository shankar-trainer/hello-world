package com.trng.response;

import com.trng.dto.DepartmentDto;
import com.trng.dto.EmployeeDto;
import lombok.Getter;
import lombok.Setter;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class DepartmentResponse1 implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private List<DepartmentDto> responseList;
    private String error="";
}
