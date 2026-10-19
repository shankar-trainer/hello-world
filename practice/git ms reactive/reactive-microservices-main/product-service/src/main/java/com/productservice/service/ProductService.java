package com.productservice.service;

import org.springframework.stereotype.Service;

import com.productservice.dto.ProductDto;
import com.productservice.repository.ProductRepository;
import com.productservice.util.EntityDtoUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductService {

	private final ProductRepository productRepository;
	private final Sinks.Many<ProductDto> sink;

	public Flux<ProductDto> getAll() {
		Flux<ProductDto> productList = productRepository.findAll()
				.map(EntityDtoUtil::toDto)
				.doOnNext(p -> log.info("Product: {}", p))
				.doOnError(e -> log.error("Error getting products", e));

		return productList;
	}

	public Mono<ProductDto> getProductById(String id) {
		Mono<ProductDto> product = productRepository.findById(id)
				.map(EntityDtoUtil::toDto);

		return product;
	}

	public Mono<ProductDto> saveProduct(Mono<ProductDto> productDto) {
		Mono<ProductDto> saved = productDto
				.map(EntityDtoUtil::toEntity)
				.flatMap(productRepository::insert)
				.map(EntityDtoUtil::toDto)
				.doOnNext(p -> {
					log.info("Saved product: {}", p);

					sink.tryEmitNext(p);
				})
				.doOnError(e -> log.error("Error saving product", e));

		return saved;
	}

	public Mono<ProductDto> updateProduct(String id, Mono<ProductDto> productDto) {
		Mono<ProductDto> updated = productRepository.findById(id)
				.flatMap(p -> productDto
						.map(EntityDtoUtil::toEntity)
						.doOnNext(e -> e.setId(id)))
				.flatMap(productRepository::save)
				.map(EntityDtoUtil::toDto)
				.doOnNext(p -> log.info("Updated product: {}", p))
				.doOnError(e -> log.error("Error updating product", e));

		return updated;
	}

	public Mono<Void> deleteProductById(String id) {
		Mono<Void> deleted = productRepository.deleteById(id)
				.doOnNext(p -> log.info("Deleted product: {}", p))
				.doOnError(e -> log.error("Error deleting product", e));

		return deleted;
	}

	public Flux<ProductDto> getProductsByPriceRange(Double min, Double max) {
		Flux<ProductDto> productList = productRepository.findByPriceBetween(min, max)
				.map(EntityDtoUtil::toDto)
				.doOnNext(p -> log.info("Product: {}", p))
				.doOnError(e -> log.error("Error getting products", e));

		return productList;
	}

}
