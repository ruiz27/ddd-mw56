package com.ddd.transportcontext.handler;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class BeltHandler {

	public Mono<ServerResponse> hello(ServerRequest request) {
		final Mono<String> present = request.bodyToMono(String.class);
		return present.flatMap( msg -> {
			String luigi = "░░░░░░░░░░░░▄▄▄▄░░░░░░░░░░░░░ +\r\n" + 
					"░░░░░░░░░░░░░░░░░░░█░░░░▀▀▄░░░░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░▄██████▄▄░░▀▄░░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░▀▀█░░▄░░▀█▄▄█▄░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░▄▀▀▀▀░░▀░░▄██░░█░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░▀▀▀░░░░█▄░▀░░▄▀░░░░░░ \r\n" + 
					"░░░░░░░░░░░░░░░░░░░▄▄▄░░░▄██▄░░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░░░░░░░░░█░░░░█░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░░░░▄▀▀▀██▀░░▀▄░░░░░░░\r\n" + 
					"░░|"+msg+"|░░░░░░░█░░░░░█░░░░█░░░░░░ \r\n" + 
					"░░░░░░░░░░░░░░░░░░░█▄▄▄█░░░▄██░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░░░░██▄▄██████░░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░░░░░░████████░░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░░░░░░████████░░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░░░░░░█▀▀▀▀▀█░░░░░░░░░\r\n" + 
					"░░░░░░░░░░░░░░░░░░░░█▄▄▄▄▄▄█░░░░░░░░░░░░░░";
			
			log.info(luigi);
			
			 return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
				      .body(BodyInserters.fromValue("Package "+msg+" received ok"))
				      .delayElement(Duration.ofSeconds(2))
				      ;
		});

	  }
}
