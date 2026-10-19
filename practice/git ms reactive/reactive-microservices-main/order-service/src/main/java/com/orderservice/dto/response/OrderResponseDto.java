package com.orderservice.dto.response;

import com.orderservice.dto.OrderStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderResponseDto {

	private Long userId;
	private String productId;
	private OrderStatus orderStatus;

}
