package com.cts.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {
	@NotNull(message = "id is blank")
	private Integer id;
	
	@NotEmpty(message="name is blank")
	private String name;
}
