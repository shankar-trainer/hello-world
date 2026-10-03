package com.productservice.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.productservice.entity.ProductEntity;
import com.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class DataSeeder {

	private final ProductRepository productRepository;
	private final Faker faker;

	public void seedData() {
		productRepository.deleteAll()
				.thenMany(productRepository.saveAll(generateProducts()))
				.thenMany(productRepository.findAll())
				.subscribe(SubscribeUtil.subscriber());
	}

	private Flux<ProductEntity> generateProducts() {
		List<ProductEntity> productEntities = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			productEntities.add(ProductEntity.builder()
					.description(faker.commerce().productName())
					.price(Double.parseDouble(faker.commerce().price(1.00, 100.00)))
					.build());
		}

		return Flux.fromIterable(productEntities);
	}

}
