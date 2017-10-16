package com.excelsiorsoft.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
	
	@Bean
	public CustomZuulFilter filter() {
		return new CustomZuulFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
