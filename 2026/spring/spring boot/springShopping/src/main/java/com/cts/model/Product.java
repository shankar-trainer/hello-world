package com.cts.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Product {
	@NotNull(message = "id is blank")
	private Integer prdid;
	
	@NotEmpty(message="name is blank")
	private String prdname;
	
	@NotNull(message = "cost is blank")
	private Float  prdcost;
	
}
