package com.userservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionResponseDto {

	private Integer userId;
	private Double amount;
	private TransactionStatus status;

}
