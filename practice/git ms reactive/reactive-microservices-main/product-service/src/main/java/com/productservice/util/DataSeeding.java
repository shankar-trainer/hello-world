package com.productservice.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataSeeding implements InitializingBean {

	private final DataSeeder dataSeeder;

	@Override
	public void afterPropertiesSet() throws Exception {
		dataSeeder.seedData();
	}

}
