package com.example.microserviceClientDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class MicroserviceClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientDemoApplication.class, args);
	}

}
