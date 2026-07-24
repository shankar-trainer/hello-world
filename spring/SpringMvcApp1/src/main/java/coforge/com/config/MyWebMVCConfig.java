package coforge.com.config;

import org.springframework.context.MessageSource;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.support.ResourceBundleMessageSource;

import org.springframework.validation.Validator;

import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import org.springframework.web.servlet.ViewResolver;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("coforge.com.controller")
public class MyWebMVCConfig implements WebMvcConfigurer {
	@Bean
	public LocalValidatorFactoryBean validator() {
		return new LocalValidatorFactoryBean();
	}

	@Override
	public Validator getValidator() {
		return validator();
	}

	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/"); // Folder location
		resolver.setSuffix(".jsp"); // File extension
		resolver.setViewClass(JstlView.class); // Optional: JSTL support
		return resolver;
	}
//	
//	@Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        // Maps requests starting with /resources/** to the physical folder /resources/
//        registry.addResourceHandler("/resources/**")
//                .addResourceLocations("/resources/");
//    }
}