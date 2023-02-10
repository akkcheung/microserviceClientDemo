package com.example.microserviceClientDemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MicroserviceClientDemoApplicationTests {

	@Autowired
	private WebTestClient webTestClient;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testHelloApi() throws Exception {
		
		String result =webTestClient
                .get()
//                .uri("http://eureka-client-service/hello-worlds/{name}", "alex")
                .uri("http://localhost:8081/hello-worlds/{name}", "alex")
//                .uri("http://EUREKA-CLIENT-SERVICE/hello-worlds/{name}", "alex")
//                .uri("http://localhost:8761/eureka-client-service/hello-worlds/{name}", "alex")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                //.toString().contains("World alex");
                .toString();

				System.out.println(result);
		
	}
}
