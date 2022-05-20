package com.profesorp.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
//http://localhost:9999/config-client/default -- load default properties config-client.properties
//http://localhost:9999/config-client/dev   -- load dev --config-client-dev.properties
//http://localhost:9999/config-client/production   -- load production --config-client-production.properties
//http://localhost:9999/actuator

//http://localhost:9999/hello/production  -- name":"hello","profiles":["production"]
//http://localhost:9999/welcome/production  -- name":"welcome","profiles":["production"]


public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
