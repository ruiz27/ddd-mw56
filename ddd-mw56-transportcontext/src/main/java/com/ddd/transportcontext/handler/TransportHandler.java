package com.ddd.transportcontext.handler;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class TransportHandler {

	public Mono<ServerResponse> hello(ServerRequest request) {
		final Mono<String> present = request.bodyToMono(String.class);
		return present.flatMap( msg -> {
			 return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
				      .body(BodyInserters.fromValue("\n"+"      |            _________________________________________  |\r\n" + 
				      		"             _____|.-----..-----..-----..-----..----..-----.] |      \r\n" + 
				      		"            /.--.|||;;;;;||;;;;;||;;;;;||;;;;;||;;;;||;;;;;|| |\r\n" + 
				      		"           //   ||||;;;;;||;;;;;||;;;;;||;;;;;||;;;;||;;;;;|| |\r\n" + 
				      		"  ___...--'|`---'|||;;;;;||;;;;;||"+msg+" ||;;;;;||;;;;||;;;;;|| |\r\n" + 
				      		" (=      | |   -'|||;;;;;||;;;;;||;;;;;||;;;;;||;;;;||;;;;;||_|__\r\n" + 
				      		" |  _..--' |____.'||;;;;;||;;;;;||;;;;;||;;;;;|'----'|;;;;;||____|\r\n" + 
				      		" |-'.----.  _____ |'-----''-----''-----''-----'.----.'-----'|.....\r\n" + 
				      		"|=./ .--. \\|=====||___________________________/ .--. \\______] \r\n" + 
				      		"'=' :(--): `-----''--------------------------' :(--): `-----'   \r\n" + 
				      		".... `--' ..................................... `--' ..LGB........"))
				      .delayElement(Duration.ofSeconds(2))
				      ;
		});

	   
	  }
}
