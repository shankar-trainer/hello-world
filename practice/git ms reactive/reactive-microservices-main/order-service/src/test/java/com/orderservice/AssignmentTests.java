package com.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.orderservice.client.ProductClient;
import com.orderservice.client.UserClient;
import com.orderservice.config.BaseTest;
import com.orderservice.dto.ProductDto;
import com.orderservice.dto.UserDto;
import com.orderservice.dto.request.OrderRequestDto;
import com.orderservice.dto.response.OrderResponseDto;
import com.orderservice.service.OrderService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class AssignmentTests extends BaseTest {

	@Autowired
	private ProductClient productClient;

	@Autowired
	private UserClient userClient;

	@Autowired
	private OrderService orderService;

	@Test
	public void shouldReturnAllProducts() {
		// given the product service is up and running
		// when I call the product service
		Flux<OrderResponseDto> response = Flux
				.zip(userClient.getUsers(), productClient.getProducts())
				.map(t -> this.getOrderRequestDto(t.getT1(), t.getT2()))
				.flatMap(dto -> orderService.processOrder(Mono.just(dto)));

		// then I should get all the products
		StepVerifier
				.create(response)
				.expectNextCount(4)
				.verifyComplete();
	}

	private OrderRequestDto getOrderRequestDto(UserDto user, ProductDto product) {
		return OrderRequestDto.builder()
				.productId(product.getId())
				.userId(user.getId())
				.build();
	}

}
