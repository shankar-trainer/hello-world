package com.userservice.service;

import org.springframework.stereotype.Service;

import com.userservice.dto.TransactionRequestDto;
import com.userservice.dto.TransactionResponseDto;
import com.userservice.dto.TransactionStatus;
import com.userservice.entity.TransactionEntity;
import com.userservice.repository.TransactionRepository;
import com.userservice.repository.UserRepository;
import com.userservice.util.TransactionMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Log4j2
public class TransactionService {

	private final TransactionRepository transactionRepository;
	private final UserRepository userRepository;

	public Mono<TransactionResponseDto> saveTransaction(final TransactionRequestDto requestDto) {
		Mono<Boolean> updateUserBalance = userRepository.updateUserBalance(requestDto.getUserId(), requestDto.getAmount());

		log.info("User balance updated: {}", updateUserBalance);

		Mono<TransactionEntity> savedTransaction = updateUserBalance
				.filter(Boolean::booleanValue)
				.map(b -> TransactionMapper.toEntity(requestDto))
				.flatMap(transactionRepository::save)
				.doOnNext(t -> log.info("Transaction saved {}", t))
				.doOnError(e -> log.error("Error saving transaction", e));

		return savedTransaction
				.map(t -> TransactionMapper.toDto(requestDto, TransactionStatus.APPROVED))
				.defaultIfEmpty(TransactionMapper.toDto(requestDto, TransactionStatus.DECLINED));
	}

	public Flux<TransactionResponseDto> findAllByUserId(final Integer userId) {
		Flux<TransactionResponseDto> transactions = transactionRepository.findAllByUserId(userId)
				.map(t -> TransactionMapper.toDto(t, TransactionStatus.APPROVED))
				.doOnNext(t -> log.info("Transaction found {}", t))
				.doOnError(e -> log.error("Error getting transactions", e));

		return transactions;
	}

}
