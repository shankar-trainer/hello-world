package com.orderservice.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.orderservice.dto.UserDto;
import com.orderservice.dto.request.TransactionRequestDto;
import com.orderservice.dto.response.TransactionResponseDto;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Log4j2
public class UserClient {

	private final WebClient webClient;

	public UserClient(@Value("${user.service.url}") String url) {
		this.webClient = WebClient.builder().baseUrl(url).build();
	}

	public Mono<TransactionResponseDto> authorizeTransaction(final TransactionRequestDto transactionRequestDto) {
		log.info("Authorizing transaction {}", transactionRequestDto);

		Mono<TransactionResponseDto> transactionResponse = webClient
				.post()
				.uri("/transactions")
				.bodyValue(transactionRequestDto)
				.retrieve()
				.bodyToMono(TransactionResponseDto.class)
				.doOnNext(p -> log.info("Transaction authorized"))
				.doOnError(e -> log.error("Error authorizing transaction", e));

		return transactionResponse;
	}

	public Flux<UserDto> getUsers() {
		log.info("Retrieving users");

		Flux<UserDto> users = webClient
				.get()
				.retrieve()
				.bodyToFlux(UserDto.class)
				.doOnNext(p -> log.info("Users retrieved {}", p));

		return users;
	}

}
