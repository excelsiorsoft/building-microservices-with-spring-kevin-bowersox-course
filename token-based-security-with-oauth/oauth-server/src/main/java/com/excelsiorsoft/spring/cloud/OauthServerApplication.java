package com.excelsiorsoft.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class OauthServerApplication {

	
	@RequestMapping("/resource")
	@PreAuthorize("hasRole('ADMIN')")
	public String resourceEndpoint() {
		return "This resource is protected by the resource server.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}
}
