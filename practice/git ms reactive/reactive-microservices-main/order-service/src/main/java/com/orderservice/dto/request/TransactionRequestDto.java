package com.orderservice.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionRequestDto {

	private Long userId;
	private Double amount;

}
