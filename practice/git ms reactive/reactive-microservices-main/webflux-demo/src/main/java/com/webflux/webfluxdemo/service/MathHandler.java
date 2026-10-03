package com.webflux.webfluxdemo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.webflux.webfluxdemo.dto.MultiplyRequest;
import com.webflux.webfluxdemo.dto.Response;
import com.webflux.webfluxdemo.exception.InputValidationException;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Log4j2
public class MathHandler {

	private final MathService mathService;

	public Mono<ServerResponse> squareHandler(ServerRequest serverRequest) {
		log.info("squareHandler: " + serverRequest.pathVariable("input"));

		Integer input = Integer.valueOf(serverRequest.pathVariable("input"));

		if (input == null || (input < 10 || input > 20)) {
			return Mono.error(
					new InputValidationException(HttpStatus.BAD_GATEWAY.value(),
							"Input should be in the range of 10 to 20"));
		}

		Mono<Response> mono = mathService.findSquare(input);

		return ServerResponse.ok().body(mono, Response.class);
	}

	public Mono<ServerResponse> cubeHandler(ServerRequest serverRequest) {
		log.info("cubeHandler: " + serverRequest.pathVariable("input"));

		Integer input = Integer.valueOf(serverRequest.pathVariable("input"));

		if (input == null || (input < 10 || input > 20)) {
			return Mono.error(
					new InputValidationException(HttpStatus.BAD_GATEWAY.value(), "Input should be in the range of 10 to 20"));
		}

		Mono<Response> mono = mathService.findCube(input);

		return ServerResponse.ok().body(mono, Response.class);
	}

	public Mono<ServerResponse> multiplyHandler(ServerRequest serverRequest) {
		Mono<MultiplyRequest> request = serverRequest.bodyToMono(MultiplyRequest.class);

		request.handle(
				(multiplyRequest, sink) -> {
					if (multiplyRequest.getFirst() == null || multiplyRequest.getSecond() == null) {
						sink.error(new RuntimeException("Both input cannot be null"));
					} else {
						sink.next(multiplyRequest);
					}
				});

		Mono<Response> mono = mathService.multiply(request);

		return ServerResponse.ok().body(mono, Response.class);
	}

	public Mono<ServerResponse> tableHandler(ServerRequest serverRequest) {
		log.info("tableHandler: " + serverRequest.pathVariable("input"));

		Integer input = Integer.valueOf(serverRequest.pathVariable("input"));

		Flux<Response> flux = mathService.multiplicationTable(input);

		return ServerResponse
				.ok()
				.contentType(MediaType.TEXT_EVENT_STREAM)
				.body(flux, Response.class);
	}

}
