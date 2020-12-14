package com.ddd.example.fabriccontext.web.client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class TransportClient {

	@SuppressWarnings("deprecation")
	public Mono<String> getResult() {
		return WebClient.create("http://localhost:8082").get().uri("/send").accept(MediaType.TEXT_PLAIN).exchange()
				.flatMap(res -> res.bodyToMono(String.class));

	}

}
