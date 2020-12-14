package com.ddd.example.fabriccontext.web.client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class TransportClient {

	public Mono<String> sendResult(String present) {
		return WebClient.create("http://localhost:8082")
				.post()
				.uri("/send")
				.bodyValue(present)
				.accept(MediaType.TEXT_PLAIN).retrieve()
				.bodyToMono(String.class);
	}

}
