package com.webflux.webfluxdemo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webflux.webfluxdemo.dto.MultiplyRequest;
import com.webflux.webfluxdemo.dto.Response;
import com.webflux.webfluxdemo.exception.InputValidationException;
import com.webflux.webfluxdemo.service.MathService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MathController {

	private final MathService mathService;

	@GetMapping("/square/{input}")
	public Mono<ResponseEntity<Response>> square(@PathVariable Integer input) {
		return Mono.just(input)
				.filter(i -> i >= 10 && i <= 20)
				.flatMap(mathService::findSquare)
				.map(ResponseEntity::ok)
				.defaultIfEmpty(ResponseEntity.badRequest().build());
	}

	@GetMapping("/square/{input}/mono")
	public Mono<Response> squareMono(@PathVariable Integer input) {
		return Mono.just(input)
				.handle((integer, sink) -> {
					if (integer > 10 || integer < 20) {
						sink.error(new InputValidationException(HttpStatus.BAD_REQUEST.value(),
								"Input should be in the range of 10 to 20"));
					} else {
						sink.next(integer);
					}
				})
				.cast(Integer.class)
				.flatMap(mathService::findSquare);
	}

	@GetMapping("/cube/{input}")
	public Mono<Response> cubic(@PathVariable Integer input) {
		System.out.println("input: " + input);
		return mathService.findCube(input);
	}

	@GetMapping("/table/{input}")
	public Flux<Response> multiplicationTable(@PathVariable Integer input) {
		return mathService.multiplicationTable(input);
	}

	@GetMapping(path = "/table/{input}/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Response> multiplicationTableStream(@PathVariable Integer input) {
		return mathService.multiplicationTable(input);
	}

	@PostMapping("/multiply")
	public Mono<Response> multiply(
			@RequestBody Mono<MultiplyRequest> requestMono,
			@RequestHeader Map<String, String> headers) {
		System.out.println("headers: " + headers);
		return mathService.multiply(requestMono);
	}

	@GetMapping("/double")
	public Mono<Response> doubleNumber(@RequestParam Integer input) {
		return mathService.doubleNumber(input);
	}

}
