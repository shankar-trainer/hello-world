package com.webflux.webfluxdemo.webclient;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.webflux.webfluxdemo.config.BaseTest;
import com.webflux.webfluxdemo.dto.MultiplyRequest;
import com.webflux.webfluxdemo.dto.Response;
import com.webflux.webfluxdemo.exception.InputValidationException;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class WebClientTests extends BaseTest {

	@Autowired
	private WebClient webClient;

	@Test
	public void multiTest() {
		Flux<Response> response = webClient
				.get()
				.uri("/table/{input}/stream", 10)
				.retrieve()
				.bodyToFlux(Response.class)
				.doOnNext(System.out::println);

		StepVerifier
				.create(response)
				.expectNextCount(10)
				.verifyComplete();
	}

	@Test
	public void singleTest() {
		Mono<Response> response = webClient
				.get()
				.uri("/square/{input}", 10)
				.retrieve()
				.bodyToMono(Response.class)
				.doOnNext(System.out::println);

		StepVerifier
				.create(response)
				.expectNextMatches(r -> r.getInput() == 100)
				.verifyComplete();
	}

	@Test
	public void postTest() {
		Mono<Response> response = webClient
				.post()
				.uri("/multiply")
				.bodyValue(buildRequest(10, 10))
				.attribute("auth", "basic")
				.retrieve()
				.bodyToMono(Response.class)
				.doOnNext(System.out::println);

		StepVerifier
				.create(response)
				.expectNextMatches(r -> r.getInput() == 100)
				.verifyComplete();
	}

	@Test
	void headersTest() {
		Mono<Response> response = webClient
				.get()
				.uri("/square/{input}", 12)
				.headers(headers -> headers.add("OP", "square"))
				.retrieve()
				.bodyToMono(Response.class)
				.doOnNext(System.out::println);

		StepVerifier
				.create(response)
				.expectNextCount(1)
				.verifyComplete();
	}

	@Test
	public void badRequestTest() {
		Mono<Response> response = webClient
				.get()
				.uri("/square/{input}", 2)
				.retrieve()
				.bodyToMono(Response.class)
				.doOnNext(System.out::println);

		StepVerifier
				.create(response)
				.verifyError(WebClientResponseException.BadRequest.class);
	}

	@Test
	public void exchangeTest() {
		Mono<?> response = webClient
				.get()
				.uri("/square/{input}", 12)
				.exchangeToMono(this::exchange)
				.doOnNext(System.out::println)
				.doOnError(error -> System.out.println(error.getMessage()));

		StepVerifier
				.create(response)
				.expectNextCount(1)
				.verifyComplete();
	}

	@Test
	public void queryParamsTest() {
		Map<String, Integer> queryParams = Map.of("input", 10);

		Mono<Response> response = webClient
				.get()
				.uri(uriBuilder -> uriBuilder
						.path("/double")
						.build(queryParams))
				.retrieve()
				.bodyToMono(Response.class)
				.doOnNext(System.out::println);

		StepVerifier
				.create(response)
				.expectNextMatches(r -> r.getInput() == 20)
				.verifyComplete();
	}

	@Test
	public void assignment() {
		List<String> opps = List.of("+", "-", "*", "/");
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		numbers.forEach(
				num -> {
					opps.forEach(
							opp -> {
								getResponse(num, opp);
							});
				});
	}

	private void getResponse(Integer num, String opp) {
		Mono<Response> response = webClient
				.get()
				.uri("/calculator/{first}/{second}", num, 10)
				.headers(headers -> headers.add("OP", opp))
				.retrieve()
				.bodyToMono(Response.class)
				.doOnNext(System.out::println);
	}

	private Mono<?> exchange(ClientResponse response) {
		if (response.statusCode() == HttpStatus.BAD_REQUEST)
			return response.bodyToMono(InputValidationException.class);

		else
			return response.bodyToMono(Response.class);
	}

	private MultiplyRequest buildRequest(Integer a, Integer b) {
		return MultiplyRequest
				.builder()
				.first(a)
				.second(b)
				.build();
	}

}
