package com.webflux.webfluxdemo.service;

import java.util.function.BiFunction;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.webflux.webfluxdemo.dto.InputFailedValidation;
import com.webflux.webfluxdemo.dto.Response;
import com.webflux.webfluxdemo.exception.InputValidationException;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Service
@Log4j2
public class AssignmentHandler {

	public Mono<ServerResponse> calculatorHandler(ServerRequest serverRequest) {
		log.info("calculatorHandler: [{}, {}]", serverRequest.pathVariable("first"), serverRequest.pathVariable("second"));
		log.info("Operation to be performed: {}", serverRequest.headers().header("OP"));

		Integer first = Integer.valueOf(serverRequest.pathVariable("first"));
		Integer second = Integer.valueOf(serverRequest.pathVariable("second"));

		if (first == null || second == null) {
			return Mono.error(
					new InputValidationException(HttpStatus.BAD_GATEWAY.value(), "Input should not be null"));
		}

		if (serverRequest.headers().header("OP").isEmpty()) {
			return Mono.error(
					new InputValidationException(HttpStatus.BAD_GATEWAY.value(), "Operation should not be null"));
		}

		Integer result = null;
		String operationHeaderValue = serverRequest.headers().header("OP").get(0);

		switch (operationHeaderValue) {
			case "+" -> result = first + second;
			case "-" -> result = first - second;
			case "*" -> result = first * second;
			case "/" -> result = first / second;
			default -> Mono.error(new InputValidationException(HttpStatus.BAD_GATEWAY.value(), "Invalid operation"));
		}

		Mono<Response> mono = Mono.just(result).map(Response::new);

		return ServerResponse.ok().body(mono, Response.class);
	}

	public BiFunction<Throwable, ServerRequest, Mono<ServerResponse>> validationExceptionHandler = (throwable,
			request) -> {
		InputValidationException inputValidationException = (InputValidationException) throwable;
		InputFailedValidation inputFailedValidation = new InputFailedValidation(
				inputValidationException.getErrorCode(), inputValidationException.getMessage());

		return ServerResponse.badRequest().bodyValue(inputFailedValidation);
	};

}
