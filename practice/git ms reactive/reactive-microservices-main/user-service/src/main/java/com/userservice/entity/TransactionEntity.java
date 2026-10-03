package com.userservice.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table("transactions")
public class TransactionEntity {

	@Id
	private Integer id;
	private Integer userId;
	private Double amount;
	private LocalDateTime transactionDate;

}
