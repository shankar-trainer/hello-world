package com.webflux.webfluxdemo.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.webflux.webfluxdemo.dto.MultiplyRequest;
import com.webflux.webfluxdemo.dto.Response;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Log4j2
public class MathService {

	public Mono<Response> findSquare(Integer input) {
		return Mono.fromSupplier(() -> input * input)
				.map(Response::new);
	}

	public Mono<Response> findCube(Integer input) {
		return Mono.fromSupplier(() -> input * input * input)
				.map(Response::new);
	}

	public Flux<Response> multiplicationTable(Integer input) {
		return Flux.range(1, 10)
				.delayElements(Duration.ofMillis(500))
				.doOnNext(i -> log.info("Processing multiplation results -> {}", i))
				.map(i -> new Response(i * input));
	}

	public Mono<Response> multiply(Mono<MultiplyRequest> request) {
		return request
				.map(r -> r.getFirst() * r.getSecond())
				.map(Response::new);
	}

	public Mono<Response> doubleNumber(Integer input) {
		return Mono
				.fromSupplier(() -> input * 2)
				.map(Response::new);
	}

}
