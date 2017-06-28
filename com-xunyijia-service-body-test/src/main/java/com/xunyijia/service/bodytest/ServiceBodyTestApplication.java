package com.xunyijia.service.bodytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBodyTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceBodyTestApplication.class, args);
	}
}
