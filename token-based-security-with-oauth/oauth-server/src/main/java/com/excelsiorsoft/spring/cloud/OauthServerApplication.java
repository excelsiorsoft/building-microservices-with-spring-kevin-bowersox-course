package com.excelsiorsoft.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAuthorizationServer
public class OauthServerApplication {

	
	@RequestMapping("/resource")
	public String resourceEndpoint() {
		return "This resource is protected by the resource server.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}
}
