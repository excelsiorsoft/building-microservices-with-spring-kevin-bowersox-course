package com.excelsiorsoft.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaController {
	
	@Autowired private RestTemplate restTemplate;
	
	@RequestMapping("/execute")
	public String execute() {
		return restTemplate.getForObject("http://secondService/serviceInfo", String.class);
	}

}
