package com.webflux.webfluxdemo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.webflux.webfluxdemo.exception.InputValidationException;
import com.webflux.webfluxdemo.service.AssignmentHandler;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class AssignmentController {

	private final AssignmentHandler requestHandler;

	@Bean
	public RouterFunction<ServerResponse> assignmentRouter() {
		return RouterFunctions.route()
				.path("calculator", this::routerFunction)
				.build();
	}

	private RouterFunction<ServerResponse> routerFunction() {
		return RouterFunctions.route()
				.GET("{first}/{second}", requestHandler::calculatorHandler)
				.onError(InputValidationException.class, requestHandler.validationExceptionHandler)
				.build();
	}

}
