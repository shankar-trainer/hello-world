package com.userservice.util;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Component
public class DataSetup implements InitializingBean {

	@Value("${classpath:db/schema.sql}")
	private Resource init;

	private final R2dbcEntityTemplate template;

	@Override
	public void afterPropertiesSet() throws Exception {
		String query = StreamUtils.copyToString(init.getInputStream(), StandardCharsets.UTF_8);

		log.info("Executing query {}", query);

		template.getDatabaseClient()
				.sql(query)
				.then()
				.subscribe();
	}

}
