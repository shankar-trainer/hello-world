package com.orderservice.util;

import com.orderservice.dto.OrderStatus;
import com.orderservice.dto.RequestContext;
import com.orderservice.dto.TransactionStatus;
import com.orderservice.dto.request.TransactionRequestDto;
import com.orderservice.dto.response.OrderResponseDto;
import com.orderservice.entity.OrderEntity;

public class EntityMapper {

	public static void setTransactionRequestDto(RequestContext requestContext) {
		TransactionRequestDto transactionRequestDto = TransactionRequestDto
				.builder()
				.userId(requestContext.getOrderRequestDto().getUserId())
				.amount(requestContext.getProductDto().getPrice())
				.build();

		requestContext.setTransactionRequestDto(transactionRequestDto);
	}

	public static OrderEntity getOrderEntity(RequestContext requestContext) {
		OrderEntity orderEntity = OrderEntity
				.builder()
				.productId(requestContext.getOrderRequestDto().getProductId())
				.userId(requestContext.getOrderRequestDto().getUserId())
				.amount(requestContext.getProductDto().getPrice())
				.build();

		TransactionStatus status = requestContext.getTransactionResponseDto().getStatus();

		if (status == TransactionStatus.APPROVED)
			orderEntity.setStatus(OrderStatus.COMPLETED);

		else if (status == TransactionStatus.DECLINED)
			orderEntity.setStatus(OrderStatus.FAILED);

		return orderEntity;
	}

	public static OrderResponseDto getOrderResponseDto(OrderEntity orderEntity) {
		return OrderResponseDto
				.builder()
				.productId(orderEntity.getProductId())
				.userId(orderEntity.getUserId())
				.orderStatus(orderEntity.getStatus())
				.build();
	}

}
