package com.orderservice.dto.response;

import com.orderservice.dto.TransactionStatus;

import lombok.Data;

@Data
public class TransactionResponseDto {

	private Integer userId;
	private Double amount;
	private TransactionStatus status;

}
