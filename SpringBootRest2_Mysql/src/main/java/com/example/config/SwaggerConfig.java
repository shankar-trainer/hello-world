package com.example.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collection;

@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){
        System.out.println("get Docket called ");
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.regex("/v1/.*")).build().apiInfo(apiInfo());
    }

    public ApiInfo apiInfo(){
        ApiInfo apiInfo=new ApiInfo("product application", "application using spring boot", "ver 1.0", "term of service", new Contact("shankar", "url to be added", "shankar7979@gmail.com"), "licence till 2025", "licence url", null) ;
        ;
        return  apiInfo;
    }

}
