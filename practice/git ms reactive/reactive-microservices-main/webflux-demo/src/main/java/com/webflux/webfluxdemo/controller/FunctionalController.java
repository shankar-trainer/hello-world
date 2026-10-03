package com.webflux.webfluxdemo.controller;

import java.util.function.BiFunction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.webflux.webfluxdemo.dto.InputFailedValidation;
import com.webflux.webfluxdemo.exception.InputValidationException;
import com.webflux.webfluxdemo.service.MathHandler;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Configuration
@RequiredArgsConstructor
public class FunctionalController {

	private final MathHandler requestHandler;

	@Bean
	public RouterFunction<ServerResponse> highLevelRouterFunction() {
		return RouterFunctions.route()
				.path("router", this::routerFunction)
				.build();
	}

	private RouterFunction<ServerResponse> routerFunction() {
		return RouterFunctions.route()
				.GET("square/{input}", requestHandler::squareHandler)
				.GET("cube/{input}", requestHandler::cubeHandler)
				.GET("table/{input}", requestHandler::tableHandler)
				.POST("multiply", requestHandler::multiplyHandler)
				.onError(InputValidationException.class, validationExceptionHandler)
				.build();
	}

	private BiFunction<Throwable, ServerRequest, Mono<ServerResponse>> validationExceptionHandler = (throwable,
			request) -> {
		InputValidationException inputValidationException = (InputValidationException) throwable;
		InputFailedValidation inputFailedValidation = new InputFailedValidation(
				inputValidationException.getErrorCode(), inputValidationException.getMessage());

		return ServerResponse.badRequest().bodyValue(inputFailedValidation);
	};

}
