package com.toavina.reactintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ReactIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactIntegrationApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/v1/*").allowedOrigins("http://localhost:5173");
			}

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/{spring:^[a-zA-Z\\-_]}")
						.setViewName("forward:/");
				registry.addViewController("/**/{spring:^[a-zA-Z\\-_]}")
						.setViewName("forward:/");
				registry.addViewController("/{spring:^[a-zA-Z\\-_]}/**{spring:?!(\\.js|\\.css)$}")
						.setViewName("forward:/");
			}
		};
	}

}
