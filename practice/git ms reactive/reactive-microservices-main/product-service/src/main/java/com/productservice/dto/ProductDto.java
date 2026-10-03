package com.productservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {

	private String id;
	private String description;
	private Double price;

}
