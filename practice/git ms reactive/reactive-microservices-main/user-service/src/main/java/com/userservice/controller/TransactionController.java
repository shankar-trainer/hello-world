package com.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.dto.TransactionRequestDto;
import com.userservice.dto.TransactionResponseDto;
import com.userservice.service.TransactionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
@Log4j2
public class TransactionController {

	private final TransactionService transactionService;

	@PostMapping
	public Mono<TransactionResponseDto> saveTransaction(@RequestBody Mono<TransactionRequestDto> requestDto) {
		log.info("Saving transaction {}", requestDto);

		return requestDto.flatMap(transactionService::saveTransaction);
	}

	@GetMapping("/user/{userId}")
	public Flux<TransactionResponseDto> findAllByUserId(@PathVariable Integer userId) {
		log.info("Getting transactions for user {}", userId);

		return transactionService.findAllByUserId(userId);
	}

}
