package com.webflux.webfluxdemo.webtestclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.webflux.webfluxdemo.config.BaseTest;
import com.webflux.webfluxdemo.dto.MultiplyRequest;
import com.webflux.webfluxdemo.dto.Response;

@AutoConfigureWebTestClient
public class WebTestClientTests extends BaseTest {

	@Autowired
	private WebTestClient webClient;

	@Test
	public void multiTest() {
		webClient
				.get()
				.uri("/table/{input}/stream", 10)
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("text/event-stream;charset=UTF-8")
				.expectBodyList(Response.class);
	}

	@Test
	public void singleTest() {
		webClient
				.get()
				.uri("/square/{input}", 10)
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody(Response.class)
				.consumeWith(System.out::println);
	}

	@Test
	public void postTest() {
		webClient
				.post()
				.uri("/multiply")
				.bodyValue(buildRequest(10, 10))
				.attribute("auth", "basic")
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody(Response.class)
				.consumeWith(System.out::println);
	}

	@Test
	void headersTest() {
		webClient
				.get()
				.uri("/square/{input}", 12)
				.headers(headers -> headers.add("OP", "square"))
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody(Response.class)
				.consumeWith(System.out::println);
	}

	@Test
	public void badRequestTest() {
		webClient
				.get()
				.uri("/square/{input}", 2)
				.exchange()
				.expectStatus().isBadRequest();
	}

	@Test
	public void exchangeTest() {
		webClient
				.get()
				.uri("/square/{input}", 12)
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody(Response.class)
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

	private MultiplyRequest buildRequest(Integer a, Integer b) {
		return MultiplyRequest
				.builder()
				.first(a)
				.second(b)
				.build();
	}

}
