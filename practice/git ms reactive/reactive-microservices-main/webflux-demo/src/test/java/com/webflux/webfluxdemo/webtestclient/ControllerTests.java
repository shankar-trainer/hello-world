package com.webflux.webfluxdemo.webtestclient;

import java.util.UUID;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.webflux.webfluxdemo.controller.MathController;
import com.webflux.webfluxdemo.dto.MultiplyRequest;
import com.webflux.webfluxdemo.dto.Response;
import com.webflux.webfluxdemo.service.MathService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@WebFluxTest(controllers = { MathController.class })
public class ControllerTests {

	@Autowired
	private WebTestClient webClient;

	@MockBean
	private MathService mathService;

	@Test
	public void singleTest() {
		Mockito
				.when(mathService.findSquare(Mockito.anyInt()))
				.thenReturn(Mono.just(new Response(100)));

		webClient
				.get()
				.uri("/square/{input}", 10)
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody(Response.class)
				.consumeWith(System.out::println)
				.value(v -> Assertions.assertThat(v.getInput()).isEqualTo(100));
	}

	@Test
	public void multiTest() {
		Flux<Response> flux = Flux.range(1, 3)
				.map(Response::new);

		Mockito
				.when(mathService.multiplicationTable(Mockito.anyInt()))
				.thenReturn(flux);

		webClient
				.get()
				.uri("/table/{input}", 10)
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBodyList(Response.class)
				.hasSize(3)
				.consumeWith(System.out::println);
	}

	@Test
	public void streamMultiTest() {
		Flux<Response> flux = Flux.range(1, 3)
				.map(Response::new);

		Mockito
				.when(mathService.multiplicationTable(Mockito.anyInt()))
				.thenReturn(flux);

		webClient
				.get()
				.uri("/table/{input}/stream", 10)
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("text/event-stream;charset=UTF-8")
				.expectBodyList(Response.class)
				.hasSize(3)
				.consumeWith(System.out::println);
	}

	@Test
	public void queryParamsTest() {
		webClient
				.get()
				.uri(uriBuilder -> uriBuilder
						.path("/double")
						.queryParam("input", 10)
						.build())
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody(Response.class)
				.consumeWith(System.out::println);
	}

	@Test
	public void postTest() {
		Mockito
				.when(mathService.multiply(Mockito.any()))
				.thenReturn(Mono.just(new Response(100)));

		MultiplyRequest request = MultiplyRequest
				.builder()
				.first(10)
				.second(10)
				.build();

		webClient
				.post()
				.uri("/multiply")
				.bodyValue(request)
				.attribute("auth", "oauth")
				.headers(header -> {
					String token = UUID.randomUUID().toString().replace("-", "");

					header.setBearerAuth(token);
				})
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody(Response.class)
				.consumeWith(System.out::println)
				.value(v -> Assertions.assertThat(v.getInput()).isEqualTo(100));
	}

	@Test
	public void errorHandlingTest() {
		Mockito.when(mathService.findSquare(Mockito.anyInt()))
				.thenReturn(Mono.just(new Response(100)));

		webClient
				.get()
				.uri("/square/{input}", 2)
				.exchange()
				.expectStatus().isBadRequest()
				.expectBody().isEmpty();
	}

}
