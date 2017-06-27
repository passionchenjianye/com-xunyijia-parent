package com.xunyijia.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DBServiceApplication {
  public static void main(String[] args) {
		SpringApplication.run(DBServiceApplication.class, args);
  }
}
