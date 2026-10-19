package com.orderservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.orderservice.dto.request.OrderRequestDto;
import com.orderservice.dto.response.OrderResponseDto;
import com.orderservice.service.OrderService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
@Log4j2
public class OrderController {

	private final OrderService orderService;

	@PostMapping
	public Mono<ResponseEntity<OrderResponseDto>> processOrder(@RequestBody Mono<OrderRequestDto> request) {
		log.info("Order request received");

		return orderService.processOrder(request)
				.map(ResponseEntity::ok)
				.onErrorReturn(WebClientResponseException.class, ResponseEntity.badRequest().build())
				.onErrorReturn(WebClientRequestException.class, ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build());
	}

	@GetMapping("/byUser/{userId}")
	public Flux<OrderResponseDto> getOrdersByUserId(@PathVariable Long userId) {
		log.info("Order request received");

		return orderService.getOrdersByUserId(userId)
				.onErrorResume(WebClientResponseException.class, e -> Flux.empty())
				.onErrorResume(WebClientRequestException.class, e -> Flux.empty());
	}

}
