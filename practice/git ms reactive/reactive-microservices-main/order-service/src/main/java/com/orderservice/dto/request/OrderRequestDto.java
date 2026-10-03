package com.orderservice.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderRequestDto {

	private Long userId;
	private String productId;

}
