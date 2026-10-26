//package com.example.ai;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.restclient.RestClientCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//
//@Configuration
//public class OllamaCloudConfiguration {
//
//    @Bean
//    RestClientCustomizer ollamaCloudAuthentication(@Value("${OLLAMA_API_KEY}") String apiKey) {
//        return builder -> builder.defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + apiKey);
//    }
//}
