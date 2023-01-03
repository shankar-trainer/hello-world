package com.in28minutes.microservices.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
//http://localhost:8001/currency-exchange/from/USD/to/INR
// take spring.application.name from currency-exchange application i.e currency-exchange-service
// append currency-exchange-service to the url http://localhost:8001/currency-exchange/from/USD/to/INR
// and change port to 8765
//http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR



//similarly change url to below one http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/
//http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/200


//change http://localhost:8100/currency-converter/from/USD/to/INR/quantity/20
//to http://localhost:8765/currency-conversion-service/currency-converter/from/USD/to/INR/quantity/20