package com.productservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.productservice.dto.ProductDto;
import com.productservice.entity.ProductEntity;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	@Mapping(source = "product", target = "productDto")
	public ProductDto toDto(ProductEntity product);

}
