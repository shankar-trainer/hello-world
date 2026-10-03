package com.webflux.webfluxdemo.webtestclient;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.webflux.webfluxdemo.controller.FunctionalController;
import com.webflux.webfluxdemo.dto.Response;
import com.webflux.webfluxdemo.service.MathHandler;

@WebFluxTest
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@ContextConfiguration(classes = { FunctionalController.class })
public class RouterFunctionTest {

	private WebTestClient webClient;

	@Autowired
	private ApplicationContext context;

	@MockBean
	private MathHandler handler;

	@BeforeAll
	public void setUp() {
		webClient = WebTestClient.bindToApplicationContext(context).build();
	}

	@Test
	public void singleTest() {
		Mockito
				.when(handler.squareHandler(Mockito.any()))
				.thenReturn(ServerResponse.ok().bodyValue(new Response(100)));

		webClient
				.get()
				.uri("/router/square/{input}", 10)
				.exchange()
				.expectStatus().is2xxSuccessful()
				.expectHeader().contentType("application/json")
				.expectBody()
				.jsonPath("$.input").isEqualTo(100)
				.consumeWith(System.out::println);
	}

}
