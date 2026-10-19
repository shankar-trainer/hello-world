package com.orderservice.dto;

import com.orderservice.dto.request.OrderRequestDto;
import com.orderservice.dto.request.TransactionRequestDto;
import com.orderservice.dto.response.TransactionResponseDto;

import lombok.Data;

@Data
public class RequestContext {

	private OrderRequestDto orderRequestDto;
	private ProductDto productDto;
	private TransactionRequestDto transactionRequestDto;
	private TransactionResponseDto transactionResponseDto;

	public RequestContext(OrderRequestDto orderRequestDto) {
		this.orderRequestDto = orderRequestDto;
	}

}
