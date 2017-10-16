package com.excelsiorsoft.spring.cloud;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@RestController
@EnableCircuitBreaker
public class HystrixApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired private RestTemplate restTemplate;
	
	@RequestMapping("/startClient")
	@HystrixCommand(fallbackMethod="failover")
	public List<String> startClient(){
		return restTemplate.getForObject("http://localhost:8899/service", List.class);
	}
	
	public List<String> failover(){
		return Arrays.asList("Default1", "Default2");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}
}
