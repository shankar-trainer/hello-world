package com.userservice.util;

import java.time.LocalDateTime;

import com.userservice.dto.TransactionRequestDto;
import com.userservice.dto.TransactionResponseDto;
import com.userservice.dto.TransactionStatus;
import com.userservice.entity.TransactionEntity;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TransactionMapper {

	public static TransactionEntity toEntity(TransactionRequestDto dto) {
		TransactionEntity entity = TransactionEntity
				.builder()
				.userId(dto.getUserId())
				.amount(dto.getAmount())
				.transactionDate(LocalDateTime.now())
				.build();

		log.info("Mapped TransactionRequestDto to TransactionEntity: {}", entity);

		return entity;
	}

	public static TransactionResponseDto toDto(TransactionRequestDto dto, TransactionStatus status) {
		TransactionResponseDto result = TransactionResponseDto
				.builder()
				.amount(dto.getAmount())
				.userId(dto.getUserId())
				.status(status)
				.build();

		log.info("Mapped TransactionEntity to TransactionRequestDto: {}", result);

		return result;
	}

	public static TransactionResponseDto toDto(TransactionEntity entity, TransactionStatus status) {
		TransactionResponseDto result = TransactionResponseDto
				.builder()
				.amount(entity.getAmount())
				.userId(entity.getUserId())
				.status(status)
				.build();

		log.info("Mapped TransactionEntity to TransactionRequestDto: {}", result);

		return result;
	}

}
