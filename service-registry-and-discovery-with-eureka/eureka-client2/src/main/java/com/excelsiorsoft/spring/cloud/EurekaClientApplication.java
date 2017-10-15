package com.excelsiorsoft.spring.cloud;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private EurekaClient client;
	
	@RequestMapping("/serviceInfo")
	public String serviceInfo() {
		
		discoveryClient.getInstances("firstService").forEach((ServiceInstance s) -> {
			System.out.println(ToStringBuilder.reflectionToString(s));
		});
		
		InstanceInfo info = client.getNextServerFromEureka("firstService", false);
		return info.getHomePageUrl();
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
