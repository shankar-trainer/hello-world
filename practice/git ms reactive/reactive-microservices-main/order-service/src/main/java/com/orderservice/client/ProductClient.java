package com.orderservice.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.orderservice.dto.ProductDto;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Log4j2
public class ProductClient {

	private final WebClient webClient;

	@Value("${product.service.url}")
	private String url;

	public ProductClient() {
		this.webClient = WebClient.builder().baseUrl(url).build();
	}

	public Mono<ProductDto> getProductById(final String productId) {
		log.info("Retrieving product with id {}", productId);

		String url = this.url + "/" + productId;

		log.info("URL: {}", url);

		Mono<ProductDto> product = webClient
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(ProductDto.class)
				.doOnNext(p -> log.info("Product with id {} retrieved", productId))
				.doOnError(e -> log.error("Error retrieving product with id {}", productId, e));

		return product;
	}

	public Flux<ProductDto> getProducts() {
		log.info("Retrieving products");

		Flux<ProductDto> products = webClient
				.get()
				.retrieve()
				.bodyToFlux(ProductDto.class)
				.doOnNext(p -> log.info("Products retrieved {}", p));

		return products;
	}

}
