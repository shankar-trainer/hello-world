package org.com.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.com.controller")
//@ComponentScan("org.com.dto")
public class MyWebMVCConfig    implements WebMvcConfigurer{

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	/*
	@Autowired
    private ObjectMapper objectMapper;// created elsewhere
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // this won't add a 2nd MappingJackson2HttpMessageConverter 
        // as the SOLUTION 2 is doing but also might seem complicated
        converters.stream().filter(c -> c instanceof MappingJackson2HttpMessageConverter).forEach(c -> {
            // check default included objectMapper._registeredModuleTypes,
            // e.g. Jdk8Module, JavaTimeModule when creating the ObjectMapper
            // without Jackson2ObjectMapperBuilder
            ((MappingJackson2HttpMessageConverter) c).setObjectMapper(this.objectMapper);
        });
	}
	*/
}
