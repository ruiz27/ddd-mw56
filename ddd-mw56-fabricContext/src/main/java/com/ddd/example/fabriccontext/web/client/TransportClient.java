package com.ddd.example.fabriccontext.web.client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * 
 * @author sergio.ruiz
 *
 */
@Slf4j
public class TransportClient {

	/**
	 * call /send transport service
	 * @param present
	 * @return
	 */
	public Mono<String> sendResult(String present) {
		log.info("Sending box");
		return WebClient.create("http://localhost:8082")
				.post()
				.uri("/send")
				.bodyValue(present)
				.accept(MediaType.TEXT_PLAIN).retrieve()
				.bodyToMono(String.class);
	}

}
