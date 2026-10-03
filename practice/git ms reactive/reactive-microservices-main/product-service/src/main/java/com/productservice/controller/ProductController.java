package com.productservice.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.dto.ProductDto;
import com.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;
	private final Flux<ProductDto> productBroadcast;

	@GetMapping
	public Flux<ProductDto> getAll() {
		return productService.getAll();
	}

	@GetMapping("/{id}")
	public Mono<ResponseEntity<ProductDto>> getProductById(@PathVariable String id) {
		return productService.getProductById(id)
				.map(ResponseEntity::ok)
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}

	@GetMapping(value = "/broadcast", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<ProductDto> getProductBroadcast() {
		return productBroadcast;
	}

	@GetMapping("/price")
	public Flux<ProductDto> getProductByPriceBetween(
			@RequestParam Double min,
			@RequestParam Double max) {
		return productService.getProductsByPriceRange(min, max);
	}

	@PostMapping
	public Mono<ResponseEntity<ProductDto>> saveProduct(@RequestBody Mono<ProductDto> productDto) {
		return productService.saveProduct(productDto)
				.map(ResponseEntity::ok);
	}

	@PutMapping("/{id}")
	public Mono<ResponseEntity<ProductDto>> updateProduct(
			@PathVariable String id,
			@RequestBody Mono<ProductDto> productDto) {
		return productService.updateProduct(id, productDto)
				.map(ResponseEntity::ok)
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public Mono<ResponseEntity<Void>> deleteProduct(@PathVariable String id) {
		return productService.deleteProductById(id)
				.map(ResponseEntity::ok);
	}

}
