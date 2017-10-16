package com.excelsiorsoft.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleService3Application {
	
	@RequestMapping("/execute")
	public String execute() {
		return "Executed Zuul service request ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleService3Application.class, args);
	}
}
