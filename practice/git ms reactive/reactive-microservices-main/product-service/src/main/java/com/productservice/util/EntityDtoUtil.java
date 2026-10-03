package com.productservice.util;

import com.productservice.dto.ProductDto;
import com.productservice.entity.ProductEntity;

public class EntityDtoUtil {

	public static ProductDto toDto(ProductEntity entity) {
		return ProductDto
				.builder()
				.id(entity.getId())
				.description(entity.getDescription())
				.price(entity.getPrice())
				.build();
	}

	public static ProductEntity toEntity(ProductDto dto) {
		return ProductEntity
				.builder()
				.id(dto.getId())
				.description(dto.getDescription())
				.price(dto.getPrice())
				.build();
	}

}
