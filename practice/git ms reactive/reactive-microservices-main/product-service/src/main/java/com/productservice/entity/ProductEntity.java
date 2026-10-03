package com.productservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "product")
@Builder
public class ProductEntity {

	@Id
	private String id;
	private String description;
	private Double price;

}
