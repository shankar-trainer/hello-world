package com.webflux.webfluxdemo.config;

import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Configuration
public class WebClientConfig {

	@Bean
	public WebClient webClient() {
		return WebClient.builder()
				.baseUrl("http://localhost:8080")
				.filter(this::auth)
				.build();
	}

	private Mono<ClientResponse> auth(ClientRequest request, ExchangeFunction exchangeFunction) {
		ClientRequest newRequest = request
				.attribute("auth")
				.map(v -> {
					if (v.equals("basic"))
						return basic(request);

					else if (v.equals("oauth"))
						return oauth(request);

					return request;
				})
				.orElse(request);

		System.out.println("newRequest: " + newRequest.headers().toSingleValueMap());

		return exchangeFunction.exchange(newRequest);
	}

	private ClientRequest basic(ClientRequest request) {
		ClientRequest newRequest = ClientRequest
				.from(request)
				.headers(header -> {
					header.setBasicAuth("username", "password");
				})
				.build();

		return newRequest;
	}

	private ClientRequest oauth(ClientRequest request) {
		ClientRequest newRequest = ClientRequest
				.from(request)
				.headers(header -> {
					header.setBearerAuth(UUID.randomUUID().toString());
				})
				.build();

		return newRequest;
	}

}
